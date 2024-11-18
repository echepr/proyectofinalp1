package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        // Crear un objeto Persona
        Persona persona = new Persona("Juan", "Pérez", "123456", "987654321");

        // Verificar los valores de los atributos
        assertEquals("Juan", persona.getNombre());
        assertEquals("Pérez", persona.getApellido());
        assertEquals("123456", persona.getID());
        assertEquals("987654321", persona.getTelefono());
    }

    @Test
    public void testMostrarInformacion() {
        // Crear un objeto Persona
        Persona persona = new Persona("Ana", "Gómez", "654321", "123456789");

        // Verificar que el método 'mostrarInformacion' devuelve la información correcta
        String expected = "Nombre: Ana\n";
        assertEquals(expected, persona.mostrarInformacion());
    }
}
