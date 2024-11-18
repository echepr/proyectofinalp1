package co.edu.uniquindio.poo;

/**
 * Clase que representa a un empleado de un concesionario. Hereda de la clase Persona
 * y tiene atributos específicos relacionados con la gestión de ventas, registro de vehículos y clientes,
 * y la autenticación del empleado.
 */
public class Empleado extends Persona {
    private String contraseña; // Contraseña del empleado
    private boolean bloqueado; // Indica si la cuenta está bloqueada

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre Nombre del empleado
     * @param apellido Apellido del empleado
     * @param ID Identificación del empleado
     * @param telefono Teléfono del empleado
     * @param contraseña Contraseña para el inicio de sesión
     */
    public Empleado(String nombre, String apellido, String ID, String telefono, String contraseña) {
        super(nombre, apellido, ID, telefono); // Llama al constructor de la clase Persona
        this.contraseña = contraseña;
        this.bloqueado = false; // Por defecto, la cuenta no está bloqueada
    }

    /**
     * Método para registrar un vehículo en el concesionario.
     * 
     * @param concesionario El concesionario donde se registrará el vehículo
     * @param vehiculo El vehículo que se va a registrar
     */
    public void registrarVehiculo(Concesionario concesionario, Vehiculo vehiculo) {
        if (vehiculo != null) {
            concesionario.agregarVehiculo(vehiculo);
            System.out.println("Vehículo registrado exitosamente.");
        } else {
            System.out.println("El vehículo no puede ser nulo.");
        }
    }

    /**
     * Método para registrar un cliente en el concesionario.
     * 
     * @param concesionario El concesionario donde se registrará el cliente
     * @param cliente El cliente que se va a registrar
     */
    public void registrarCliente(Concesionario concesionario, Cliente cliente) {
        if (cliente != null) {
            concesionario.agregarCliente(cliente);
            System.out.println("Cliente registrado exitosamente.");
        } else {
            System.out.println("El cliente no puede ser nulo.");
        }
    }

    /**
     * Método para alquilar un vehículo a un cliente.
     * 
     * @param concesionario El concesionario donde se realiza el alquiler
     * @param marca La marca del vehículo que se desea alquilar
     * @param cliente El cliente que alquilará el vehículo
     * @param dias El número de días que se alquilará el vehículo
     */
    public void alquilarVehiculo(Concesionario concesionario, String marca, Cliente cliente, int dias) {
        if (dias <= 0) {
            System.out.println("El número de días debe ser mayor a 0.");
            return;
        }

        // Buscar el vehículo por marca
        Vehiculo vehiculo = concesionario.buscarVehiculoPorMarca(marca);
        if (vehiculo != null) {
            if (vehiculo.isDisponible()) {
                // Marca el vehículo como no disponible
                vehiculo.setDisponible(false);
                // Registrar la transacción
                concesionario.registrarTransaccion("Alquiler", cliente, vehiculo);
                System.out.println("El vehículo " + marca + " ha sido alquilado por " + dias + " días.");
            } else {
                // El vehículo no está disponible
                System.out.println("El vehículo " + marca + " no está disponible para el alquiler.");
            }
        } else {
            // Vehículo no encontrado
            System.out.println("Vehículo no encontrado.");
        }
    }

    /**
     * Método para vender un vehículo a un cliente.
     * 
     * @param concesionario El concesionario donde se realiza la venta
     * @param marca La marca del vehículo que se desea vender
     * @param cliente El cliente que comprará el vehículo
     */
    public void venderVehiculo(Concesionario concesionario, String marca, Cliente cliente) {
        Vehiculo vehiculo = concesionario.buscarVehiculoPorMarca(marca);
        if (vehiculo != null) {
            concesionario.eliminarVehiculo(vehiculo);
            concesionario.registrarTransaccion("Venta", cliente, vehiculo);
            System.out.println("El vehículo " + marca + " ha sido vendido exitosamente.");
        } else {
            System.out.println("El vehículo no existe.");
        }
    }

    /**
     * Método para comprar un vehículo para el concesionario.
     * 
     * @param concesionario El concesionario donde se comprará el vehículo
     * @param vehiculo El vehículo que se comprará
     * @param cliente El cliente que comprará el vehículo
     */
    public void comprarVehiculo(Concesionario concesionario, Vehiculo vehiculo, Cliente cliente) {
        if (vehiculo != null) {
            concesionario.agregarVehiculo(vehiculo);
            concesionario.registrarTransaccion("Compra", cliente, vehiculo);
            System.out.println("El vehículo " + vehiculo.getMarca() + " ha sido comprado exitosamente.");
        } else {
            System.out.println("El vehículo no puede ser nulo.");
        }
    }
    /**
     * Método para iniciar sesión con la contraseña del empleado.
     * 
     * @param contraseña La contraseña proporcionada para el inicio de sesión
     * @return true si el inicio de sesión es exitoso, false si la contraseña es incorrecta o la cuenta está bloqueada
     */
    public boolean iniciarSesion(String contraseña) {
        if (this.contraseña.equals(contraseña) && !bloqueado) {
            System.out.println("Inicio de sesión exitoso para: " + getNombre());
            return true;
        } else {
            System.out.println("Credenciales inválidas o cuenta bloqueada.");
            return false;
        }
    }

    /**
     * Método para cambiar la contraseña del empleado.
     * 
     * @param nuevaContraseña La nueva contraseña para el empleado
     */
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
        System.out.println("Contraseña cambiada exitosamente.");
    }

    // Getters y Setters

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    /**
     * Método que muestra la información del empleado, incluyendo su nombre, ventas y la contraseña oculta.
     * 
     * @return Información del empleado como cadena de texto
     */
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nContraseña: " + (contraseña.replaceAll(".", "*")) + "\n"; // Oculta la contraseña
    }
}
