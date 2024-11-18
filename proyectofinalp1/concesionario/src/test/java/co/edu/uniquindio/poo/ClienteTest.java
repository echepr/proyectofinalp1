package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    void testListaVehiculosVaciaAlCrearCliente() {
        // Crear un cliente sin agregar vehículos
        Cliente cliente = new Cliente("Luis", "García", "11223", "555-1122");

        // Verificar que la lista de vehículos está vacía
        assertTrue(cliente.getVehiculos().isEmpty(), "La lista de vehículos debería estar vacía al crear el cliente.");
    }
    

    
}
