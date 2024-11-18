package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    private Concesionario concesionario;
    private Administrador administrador;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo sedan;
    private Vehiculo van;

    @BeforeEach
    void setUp() {
        // Inicialización de objetos comunes para las pruebas
        concesionario = new Concesionario("Concesionario Tu Carro UQ", "Calle 123");
        administrador = new Administrador("Maicol", "Ochoa", "2900", "3216489340", "M123", "Nombre de mi mamá", "Tatiana");
        concesionario.agregarAdministrador(administrador);
        empleado = new Empleado("Robert", "Sanchez", "777", "3146772134", "LPZ");
        administrador.gestionarEmpleados(empleado);
        cliente = new Cliente("Juan", "Pérez", "C001", "3123456789");
        concesionario.agregarCliente(cliente);

        sedan = new Sedan("Toyota", "Corolla", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, true, 120, 200, 4, 5, 20, true, false, false, 4, true, true, false, true,true);
        van = new Van("Mercedes", "Vito", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, true, 170, 250, true, 8, 3, 3, true, false, 2, true);
    }

    @Test
    void testRegistrarCliente() {
        // Agregar cliente al concesionario
        concesionario.agregarCliente(cliente);
        
        // Verificar que el cliente fue agregado
        assertTrue(concesionario.getClientes().contains(cliente), "El cliente debería estar registrado en el concesionario.");
    }

    @Test
    void testAgregarVehiculoACliente() {
        // Agregar vehículos al cliente
        cliente.agregarVehiculo(sedan);
        cliente.agregarVehiculo(van);
        
        // Verificar que los vehículos han sido agregados correctamente
        assertTrue(cliente.getVehiculos().contains(sedan), "El vehículo sedan debería estar asociado al cliente.");
        assertTrue(cliente.getVehiculos().contains(van), "El vehículo van debería estar asociado al cliente.");
    }

    @Test
    void testBuscarVehiculoPorMarca() {
        // Agregar vehículos al concesionario
        concesionario.agregarVehiculo(sedan);
        concesionario.agregarVehiculo(van);
        
        // Buscar un vehículo por su marca
        Vehiculo vehiculoEncontrado = concesionario.buscarVehiculoPorMarca("Toyota");
        
        // Verificar que el vehículo encontrado es el correcto
        assertNotNull(vehiculoEncontrado, "El vehículo con marca Toyota debería ser encontrado.");
        assertEquals("Toyota", vehiculoEncontrado.getMarca(), "El vehículo encontrado debería ser de marca Toyota.");
    }



    @Test
    void testNoIniciarSesionConCredencialesIncorrectas() {
        // Intentar iniciar sesión con credenciales incorrectas
        boolean sesionIniciada = administrador.iniciarSesion("M123", "ContraseñaIncorrecta");
        
        // Verificar que la sesión no se haya iniciado
        assertFalse(sesionIniciada, "El administrador no debería poder iniciar sesión con credenciales incorrectas.");
    }
     
}