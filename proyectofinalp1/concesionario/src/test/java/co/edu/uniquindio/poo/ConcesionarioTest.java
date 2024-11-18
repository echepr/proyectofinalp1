package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConcesionarioTest {
    @Test
    void testAgregarClienteValido() {
        // Crear un objeto Concesionario
        Concesionario concesionario = new Concesionario("Concesionario UQ", "Calle 123");

        // Crear un cliente válido
        Cliente cliente = new Cliente("Juan", "Pérez", "12345", "555-1234");

        // Agregar el cliente al concesionario
        concesionario.agregarCliente(cliente);

        // Verificar que el cliente ha sido agregado correctamente
        assertEquals(1, concesionario.getClientes().size(), "La lista de clientes debería contener 1 cliente.");
    }
}
