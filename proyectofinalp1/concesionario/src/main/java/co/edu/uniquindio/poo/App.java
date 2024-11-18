package co.edu.uniquindio.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario("Concesionario Tu Carro UQ", "Calle 123");

        
        // Crear un administrador
        Administrador administrador = new Administrador("Maicol", "Ochoa", "2900", "3216489340", "M123", "Nombre de mi mamá", "Tatiana");
        concesionario.agregarAdministrador(administrador);

        Empleado empleado = new Empleado("Robert", "Sanchez", "777", "3146772134", "LPZ");
        administrador.gestionarEmpleados(empleado);

        Sedan sedan2 = new Sedan("Toyota", "Corolla", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, true, 120, 200, 4, 5, 20, true, false, false, 4, true, true, false, true,true);
        Van van2 = new Van("Mercedes", "Vito", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, true, 170, 250,false,8, 3, 3, true, false, 2, true);


        Cliente cliente = new Cliente("Juan", "Pérez", "C001", "3123456789");
        concesionario.agregarCliente(cliente);
        cliente.agregarVehiculo(sedan2);
        cliente.agregarVehiculo(van2);
        System.out.println("Vehículo asociado al cliente Juan Pérez: " + sedan2.getMarca() + " " + sedan2.getModelo());
        System.out.println("Vehículo asociado al cliente Juan Pérez: " + van2.getMarca() + " " + van2.getModelo());


        // Crear algunos vehículos y agregarlos al concesionario
        Sedan sedan = new Sedan("Toyota", "Corolla", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, true, 120, 200, 4, 5, 20, true, false, false, 4, true, true, false, true,true);
        Deportivo deportivo = new Deportivo("Ferrari", "488", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, true, 220, 300, 2, 2, 2, 500, 1.25,true);
        Van van = new Van("Mercedes", "Vito", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, true, 170, 250, true, 8, 3, 3, true, false, 2, true);
        Moto moto = new Moto("Yamaha", "MT09", false, TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 220, 900,true);
        Camion camion = new Camion("Volvo", "VNL", TipoCombustible.DIESEL, TipoTransmision.MANUAL, true, 190, 3000, 1000, true, false, true, 4, "Carga",true);
        Bus bus = new Bus("BYD", "K11", TipoCombustible.ELECTRICO, TipoTransmision.AUTOMATICA, true, 210, 5000, 20, 2, 20, true, false, 2, true, 6, 4, true);
        Camioneta camioneta = new Camioneta("Lamborghini", "Urus", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, false, 230, 4000, 4, 2, 5, true, true, true, 2, false, true, true, true, false, true);


        System.out.println("--- Vehiculos del concesionario ---");

        concesionario.agregarVehiculo(sedan);
        System.out.println("" + sedan + "\n");

        concesionario.agregarVehiculo(deportivo);
        System.out.println(" " + deportivo + "\n");

        concesionario.agregarVehiculo(van);
        System.out.println(" " + van + "\n");

        concesionario.agregarVehiculo(moto);
        System.out.println("" + moto + "\n");

        concesionario.agregarVehiculo(camion);
        System.out.println("" + camion + "\n");

        concesionario.agregarVehiculo(bus);
        System.out.println("" + bus + "\n");

        concesionario.agregarVehiculo(camioneta);
        System.out.println("" + camioneta + "\n");

        // Crear un scanner para recibir entradas del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Registro de Clientes");
            System.out.println("2. Alquiler de Vehículo");
            System.out.println("3. Venta de Vehículo");
            System.out.println("4. Compra de Vehículo");
            System.out.println("5. Salir");
            System.out.println("6. Menú del Administrador");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1: // Registro de Clientes
                    System.out.println("--- Registro de Clientes ---");
    
                    // Validar ID del cliente
                    String idCliente = Validaciones.validarIdCliente(scanner, "Ingresa el ID del cliente (10 dígitos): ");
    
                    // Validar nombre del cliente
                    String nombreCliente = Validaciones.validarNombreOApellido(scanner, "Ingresa el nombre del cliente (primera letra en mayúscula): ");
    
                    // Validar apellido del cliente
                    String apellidoCliente = Validaciones.validarNombreOApellido(scanner, "Ingresa el apellido del cliente (primera letra en mayúscula): ");
    
                    // Validar teléfono del cliente
                    String telefonoCliente = Validaciones.validarTelefono(scanner, "Ingresa el teléfono del cliente (10 dígitos): ");
    
                    // Crear y registrar el cliente
                    Cliente nuevoCliente = new Cliente(nombreCliente, apellidoCliente, idCliente, telefonoCliente);
                    concesionario.agregarCliente(nuevoCliente);
                    System.out.println("Cliente registrado exitosamente.");
                    break;


                case 2: // Alquiler de Vehículo
                    System.out.println("--- Alquiler de Vehículo ---");
                    System.out.print("Ingresa la marca del vehículo a alquilar: ");
                    String marcaVehiculoAlquiler = scanner.nextLine();
                    Vehiculo vehiculoAlquiler = concesionario.buscarVehiculoPorMarca(marcaVehiculoAlquiler);
                
                    if (vehiculoAlquiler != null) {
                        if (vehiculoAlquiler.isDisponible()) {
                            System.out.print("Ingresa el ID del cliente arrendador: ");
                            String idClienteAlquiler = scanner.nextLine();
                            Cliente clienteAlquiler = concesionario.buscarClientePorId(idClienteAlquiler);
                
                            if (clienteAlquiler != null) {
                                System.out.print("Ingresa el ID del empleado que realiza la venta: ");
                                String idEmpleadoAlquiler = scanner.nextLine();
                                Empleado empleadoAlquiler = administrador.buscarEmpleadoPorId(idEmpleadoAlquiler); // Uso del método aquí
                
                                if (empleadoAlquiler != null) {
                                    System.out.print("Ingresa la duración del alquiler (en días): ");
                                    int duracionDias = scanner.nextInt();
                                    scanner.nextLine(); // Limpiar el buffer
                
                                    vehiculoAlquiler.setDisponible(false); // Marcar el vehículo como no disponible
                                    concesionario.registrarTransaccion(
                                        "Alquiler por " + duracionDias + " días, realizado por " + empleadoAlquiler.getNombre(),
                                        clienteAlquiler,
                                        vehiculoAlquiler
                                    );
                                    System.out.println("Alquiler realizado exitosamente.");
                                } else {
                                    System.out.println("Empleado no encontrado.");
                                }
                            } else {
                                System.out.println("Cliente no encontrado.");
                            }
                        } else {
                            System.out.println("El vehículo no está disponible para alquiler.");
                        }
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                
                case 3: // Venta de Vehículo
                    System.out.println("--- Venta de Vehículo ---");
                    System.out.print("Ingresa la marca del vehículo a vender: ");
                    String marcaVehiculoVenta = scanner.nextLine();
                
                    // Buscar el vehículo por marca en el concesionario
                    Vehiculo vehiculoVenta = concesionario.buscarVehiculoPorMarca(marcaVehiculoVenta);
                
                    if (vehiculoVenta != null) {
                        System.out.print("Ingresa el ID del cliente comprador: ");
                        String idClienteVenta = scanner.nextLine();
                        Cliente clienteVenta = concesionario.buscarClientePorId(idClienteVenta);
                
                        if (clienteVenta != null) {
                            System.out.print("Ingresa el ID del empleado que realiza la venta: ");
                            String idEmpleadoVenta = scanner.nextLine();
                            Empleado empleadoVenta = administrador.buscarEmpleadoPorId(idEmpleadoVenta); // Uso del método aquí
                
                            if (empleadoVenta != null) {
                                // Verificar que el vehículo no esté marcado como no disponible
                                if (vehiculoVenta.isDisponible()) {
                                    vehiculoVenta.setDisponible(false); // Marcar el vehículo como no disponible
                                    System.out.print("Ingresa el precio de la venta: ");
                                    double precioVenta = scanner.nextDouble();
                                    scanner.nextLine(); // Limpiar el buffer
                
                                    // Registrar la transacción en el concesionario
                                    concesionario.registrarTransaccion(
                                        "Venta de vehículo realizado por " + empleadoVenta.getNombre() + ", Precio: " + precioVenta,
                                        clienteVenta,
                                        vehiculoVenta
                                    );
                                    System.out.println("Venta realizada exitosamente.");
                                } else {
                                    System.out.println("El vehículo no está disponible para la venta.");
                                }
                            } else {
                                System.out.println("Empleado no encontrado.");
                            }
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                
                

                    case 4: // Compra de Vehículo
                    System.out.println("--- Compra de Vehículo ---");
                    System.out.print("Ingresa el ID del cliente que vende el vehículo: ");
                    String idClienteVendedor = scanner.nextLine();
                    Cliente clienteVendedor = concesionario.buscarClientePorId(idClienteVendedor);
                
                    if (clienteVendedor != null) {
                        System.out.println("Vehículos disponibles del cliente:");
                        for (Vehiculo vehiculo : clienteVendedor.getVehiculos()) {
                            System.out.println("- " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                                               " (Revisión técnica: " + (vehiculo.isRevisionTecnica() ? "Aprobada" : "Pendiente") + ")");
                        }
                
                        System.out.print("Ingresa la marca del vehículo a comprar: ");
                        String marcaVehiculoCompra = scanner.nextLine();
                        Vehiculo vehiculoCompra = clienteVendedor.buscarVehiculoPorMarca(marcaVehiculoCompra);
                
                        if (vehiculoCompra != null) {
                            if (vehiculoCompra.isRevisionTecnica()) {
                                System.out.print("Ingresa el ID del empleado que realiza la compra: ");
                                String idEmpleadoCompra = scanner.nextLine();
                                Empleado empleadoCompra = administrador.buscarEmpleadoPorId(idEmpleadoCompra);
                
                                if (empleadoCompra != null) {
                                    // Transferir el vehículo
                                    clienteVendedor.removerVehiculo(vehiculoCompra); // Elimina el vehículo del cliente
                                    concesionario.agregarVehiculo(vehiculoCompra);   // Agrega el vehículo al concesionario
                
                                    // Registrar la transacción
                                    concesionario.registrarTransaccion(
                                        "Compra de vehículo realizada por " + empleadoCompra.getNombre(),
                                        clienteVendedor,
                                        vehiculoCompra
                                    );
                
                                    System.out.println("Compra realizada con éxito. El vehículo ahora pertenece al concesionario.");
                                } else {
                                    System.out.println("Empleado no encontrado.");
                                }
                            } else {
                                System.out.println("El vehículo no ha pasado la revisión técnica. No se puede comprar.");
                            }
                        } else {
                            System.out.println("El cliente no tiene un vehículo con esa marca.");
                        }
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                
                case 5: // Salir
                    System.out.println("Saliendo de la aplicación...");
                    scanner.close();
                    return;

                case 6: // Menú del Administrador
                    System.out.println("--- Acceso al Administrador ---");
                    System.out.print("Ingresa tu ID de administrador: ");
                    String idAdmin = scanner.nextLine();
                    System.out.print("Ingresa tu contraseña: ");
                    String contrasenaAdmin = scanner.nextLine();

                    if (administrador.iniciarSesion(idAdmin, contrasenaAdmin)) {
                        boolean salirAdmin = false;
                        while (!salirAdmin) {
                            System.out.println("\n--- Opciones del Administrador ---");
                            System.out.println("1. Generar reportes");
                            System.out.println("2. Registrar empleado");
                            System.out.println("3. Actualizar empleado");
                            System.out.println("4. Bloquear cuenta");
                            System.out.println("5. Desbloquear cuenta");
                            System.out.println("6. Cambiar contraseña");
                            System.out.println("7. Recuperar contraseña");
                            System.out.println("8. Salir");
                            System.out.print("Elige una opción: ");
                            int opcionAdmin = scanner.nextInt();
                            scanner.nextLine(); // Limpiar buffer

                            switch (opcionAdmin) {
                                case 1:// Registro de Transacciones
                                concesionario.mostrarTransacciones();
                                break;

                                case 2: // Agregar Empleado
                                    System.out.println("\n--- Agregar Empleado ---");
                                    System.out.print("Ingresa el nombre del empleado: ");
                                    String nombreEmpleado = scanner.nextLine();
                                    System.out.print("Ingresa el apellido del empleado: ");
                                    String apellidoEmpleado = scanner.nextLine();
                                    System.out.print("Ingresa el ID del empleado: ");
                                    String idEmpleado = scanner.nextLine();
                                    System.out.print("Ingresa el teléfono del empleado: ");
                                    String telefonoEmpleado = scanner.nextLine();
                                    System.out.print("Ingresa la contraseña del empleado: ");
                                    String contraseñaEmpleado = scanner.nextLine();
                                
                                    // Crear y agregar empleado al administrador
                                    Empleado nuevoEmpleado = new Empleado(nombreEmpleado, apellidoEmpleado, idEmpleado, telefonoEmpleado, contraseñaEmpleado);
                                    administrador.gestionarEmpleados(nuevoEmpleado); // Agregar empleado al administrador
                                
                                    System.out.println("Empleado agregado exitosamente.");
                                
                                    // Imprimir la lista de empleados
                                    System.out.println("\n--- Lista de Empleados Registrados ---");
                                    for (Empleado empleadoActual : administrador.getEmpleados()) {
                                        System.out.println("Nombre: " + empleadoActual.getNombre() +
                                                           ", Apellido: " + empleadoActual.getApellido() +
                                                           ", ID: " + empleadoActual.getID());
                                    }
                                    break;
                                
                                case 3: // Actualizar empleado
                                    System.out.println("--- Actualizar Datos de Empleado ---");
                                    System.out.print("Ingresa el ID del empleado: ");
                                    String idActualizar = scanner.nextLine();
                                    System.out.print("Ingresa el nuevo nombre: ");
                                    String nuevoNombre = scanner.nextLine();
                                    System.out.print("Ingresa el nuevo apellido: ");
                                    String nuevoApellido = scanner.nextLine();
                                    System.out.print("Ingresa el nuevo teléfono: ");
                                    String nuevoTelefono = scanner.nextLine();
                                    System.out.print("Ingresa la nueva contraseña: ");
                                    String nuevaContrasena = scanner.nextLine();
                                    administrador.actualizarEmpleado(idActualizar, nuevoNombre, nuevoApellido, nuevoTelefono, nuevaContrasena);
                                    break;

                                case 4: // Bloquear cuenta
                                    System.out.println("--- Bloquear Cuenta ---");
                                    System.out.print("Ingresa el ID del empleado a bloquear: ");
                                    String idBloquear = scanner.nextLine();
                                    administrador.bloquearCuenta(idBloquear);
                                    break;
                                
                                case 5: // Desbloquear cuenta
                                    System.out.println("--- Desbloquear Cuenta ---");
                                    System.out.print("Ingresa el ID del empleado a desbloquear: ");
                                    String idDesbloquear = scanner.nextLine();
                                    administrador.desbloquearCuenta(idDesbloquear);
                                    break;
                                
                                case 6: // Cambiar contraseña
                                    System.out.println("--- Cambiar Contraseña ---");
                                    System.out.print("Ingresa la nueva contraseña: ");
                                    String nuevaContraseña = scanner.nextLine();
                                    administrador.cambiarContraseña(nuevaContraseña);
                                    break;

                                case 7: // Recuperar contraseña
                                    System.out.println("--- Recuperar Contraseña ---");
                                    System.out.print("Ingresa tu ID de administrador: ");
                                    String idAdminRecuperar = scanner.nextLine();
                                
                                    // Buscar administrador por ID
                                    if (idAdmin.equals(administrador.getID())) {
                                        System.out.println("Pregunta de seguridad: " + administrador.getPreguntaSeguridad());
                                        System.out.print("Respuesta: ");
                                        String respuestaSeguridad = scanner.nextLine();
                                
                                        // Verificar respuesta de seguridad
                                        if (respuestaSeguridad.equalsIgnoreCase(administrador.getRespuestaSeguridad())) {
                                            System.out.print("Ingresa tu nueva contraseña: ");
                                            String nuevaContrasenaRecuperacion = scanner.nextLine();
                                            administrador.cambiarContraseña(nuevaContrasenaRecuperacion);
                                            System.out.println("Contraseña actualizada exitosamente.");
                                        } else {
                                            System.out.println("Respuesta incorrecta. No se puede recuperar la contraseña.");
                                        }
                                    } else {
                                        System.out.println("ID de administrador no encontrado.");
                                    }
                                    break;
                                

                                case 8:
                                    salirAdmin = true;
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                            }
                        }
                    } else {
                        System.out.println("Credenciales incorrectas.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
