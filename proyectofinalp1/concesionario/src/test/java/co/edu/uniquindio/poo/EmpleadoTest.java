package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmpleadoTest {
    @Test
    public void testIniciarSesion() {
        // Crear un empleado con contraseña correcta
        Empleado empleado = new Empleado("Juan", "Pérez", "12345", "555-1234", "contraseña123");

        // Caso 1: Credenciales correctas
        assertTrue(empleado.iniciarSesion("contraseña123"), "El inicio de sesión debería ser exitoso con la contraseña correcta.");

        // Caso 2: Contraseña incorrecta
        assertFalse(empleado.iniciarSesion("contraseñaErronea"), "El inicio de sesión debería fallar con la contraseña incorrecta.");

        // Caso 3: Cuenta bloqueada
        empleado.setBloqueado(true);
        assertFalse(empleado.iniciarSesion("contraseña123"), "El inicio de sesión debería fallar si la cuenta está bloqueada.");
    }

    
    
}
