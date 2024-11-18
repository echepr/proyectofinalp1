package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdministradorTest {
    private Administrador administrador;

    @BeforeEach
    public void setUp() {
        administrador = new Administrador("Juan", "Perez", "A001", "123456789", "admin123", "¿Cuál es tu color favorito?", "Azul");
    }

    @Test
    public void testIniciarSesionExitoso() {
        // Intentar iniciar sesión con las credenciales correctas
        boolean exito = administrador.iniciarSesion("A001", "admin123");
        assertTrue(exito);
    }

    @Test
    public void testIniciarSesionFallido() {
        // Intentar iniciar sesión con una contraseña incorrecta
        boolean exito = administrador.iniciarSesion("A001", "incorrecta123");
        assertFalse(exito);

        // Intentar iniciar sesión con una cuenta bloqueada
        administrador.setBloqueado(true);
        exito = administrador.iniciarSesion("A001", "admin123");
        assertFalse(exito);
    }

    @Test
    public void testRecuperarContraseñaExitoso() {
        // Intentar recuperar la contraseña con la respuesta correcta a la pregunta de seguridad
        boolean exito = administrador.recuperarContraseña("Azul", "nuevaContraseña123");
        assertTrue(exito);
        assertEquals("nuevaContraseña123", administrador.getContraseña());
    }

    @Test
    public void testRecuperarContraseñaFallido() {
        // Intentar recuperar la contraseña con una respuesta incorrecta
        boolean exito = administrador.recuperarContraseña("Rojo", "nuevaContraseña123");
        assertFalse(exito);
    }
    
    
}
