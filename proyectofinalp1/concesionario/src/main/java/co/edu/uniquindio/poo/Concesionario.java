package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un concesionario de vehículos.
 * El concesionario gestiona vehículos, clientes, administradores y transacciones.
 */
public class Concesionario {
    
    private String nombre; // Nombre del concesionario
    private String direccion; // Dirección del concesionario
    private List<Vehiculo> vehiculos = new LinkedList<>(); // Lista para almacenar los vehículos
    private List<Cliente> clientes = new LinkedList<>();   // Lista para almacenar los clientes
    private List<String> transacciones = new LinkedList<>(); // Lista para registrar transacciones
    private List<Administrador> administradores = new LinkedList<>(); // Lista para almacenar administradores
    
    /**
     * Constructor para inicializar el concesionario con su nombre y dirección.
     * 
     * @param nombre El nombre del concesionario.
     * @param direccion La dirección del concesionario.
     */
    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Agrega un administrador al concesionario.
     * 
     * @param administrador El administrador a agregar.
     */
    public void agregarAdministrador(Administrador administrador) {
        administradores.add(administrador);
        System.out.println("Cliente agregado: " + administrador.getNombre());
    }

    // Métodos de manejo de vehículos

    /**
     * Agrega un vehículo al concesionario.
     * 
     * @param vehiculo El vehículo a agregar.
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

    /**
     * Elimina un vehículo del concesionario.
     * 
     * @param vehiculo El vehículo a eliminar.
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.remove(vehiculo)) {
            System.out.println("Vehículo eliminado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        } else {
            System.out.println("Vehículo no encontrado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
    }

    /**
     * Busca un vehículo por su marca.
     * 
     * @param marca La marca del vehículo a buscar.
     * @return El vehículo encontrado o null si no se encuentra.
     */
    public Vehiculo buscarVehiculoPorMarca(String marca) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
                return vehiculo;
            }
        }
        System.out.println("Vehículo no encontrado con marca: " + marca);
        return null;
    }

    // Métodos de manejo de clientes

    /**
     * Agrega un cliente al concesionario.
     * 
     * @param cliente El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente agregado: " + cliente.getNombre());
    }

    /**
     * Busca un cliente por su ID.
     * 
     * @param id El ID del cliente a buscar.
     * @return El cliente encontrado o null si no se encuentra.
     */
    public Cliente buscarClientePorId(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getID().equals(id)) {
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado con ID: " + id);
        return null;
    }

    /**
     * Lista todos los vehículos disponibles en el concesionario.
     */
    public void listarVehiculos() {
        System.out.println("Lista de vehículos:");
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo.toString());
            }
        }
    }

    /**
     * Lista todos los clientes registrados en el concesionario.
     */
    public void listarClientes() {
        System.out.println("Lista de clientes:");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente.mostrarInformacion());
            }
        }
    }

    /**
     * Registra una transacción realizada en el concesionario.
     * 
     * @param tipo El tipo de transacción (venta, alquiler, etc.).
     * @param cliente El cliente involucrado en la transacción.
     * @param vehiculo El vehículo relacionado con la transacción.
     */
    public void registrarTransaccion(String tipo, Cliente cliente, Vehiculo vehiculo) {
        String transaccion = tipo + ": " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                             " relacionado con " + cliente.getNombre() + ".";
        transacciones.add(transaccion);
        System.out.println("Transacción registrada: " + transaccion);
    }

    /**
     * Muestra todas las transacciones registradas en el concesionario.
     */
    public void mostrarTransacciones() {
        System.out.println("Registro de Transacciones:");
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            for (String transaccion : transacciones) {
                System.out.println(transaccion);
            }
        }
    }

    // Getters y setters

    /**
     * Obtiene el nombre del concesionario.
     * 
     * @return El nombre del concesionario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del concesionario.
     * 
     * @param nombre El nombre del concesionario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del concesionario.
     * 
     * @return La dirección del concesionario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del concesionario.
     * 
     * @param direccion La dirección del concesionario.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la lista de vehículos en el concesionario.
     * 
     * @return La lista de vehículos.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece la lista de vehículos del concesionario.
     * 
     * @param vehiculos La lista de vehículos.
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Obtiene la lista de clientes del concesionario.
     * 
     * @return La lista de clientes.
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Establece la lista de clientes del concesionario.
     * 
     * @param clientes La lista de clientes.
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Obtiene la lista de transacciones del concesionario.
     * 
     * @return La lista de transacciones.
     */
    public List<String> getTransacciones() {
        return transacciones;
    }

    /**
     * Establece la lista de transacciones del concesionario.
     * 
     * @param transacciones La lista de transacciones.
     */
    public void setTransacciones(List<String> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Obtiene la lista de administradores del concesionario.
     * 
     * @return La lista de administradores.
     */
    public List<Administrador> getAdministradores() {
        return administradores;
    }

    /**
     * Establece la lista de administradores del concesionario.
     * 
     * @param administradores La lista de administradores.
     */
    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }
}
