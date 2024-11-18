package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class ValidacionesTest {

    /**
     * Test que valida el método validarIdCliente.
     * Simula la entrada del usuario con un ID válido de 10 dígitos
     * y verifica que el método devuelva el valor correcto.
     */
    @Test
    void testValidarIdCliente() {
        // Simular entrada del usuario con un ID válido
        String entradaSimulada = "1234567890\n";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));
        Scanner scanner = new Scanner(System.in);

        // Llamar al método con el mensaje de prueba
        String idCliente = Validaciones.validarIdCliente(scanner, "Ingrese el ID del cliente: ");

        // Validar que el ID devuelto sea correcto
        assertEquals("1234567890", idCliente, "El ID del cliente debería ser '1234567890'");
    }
}
