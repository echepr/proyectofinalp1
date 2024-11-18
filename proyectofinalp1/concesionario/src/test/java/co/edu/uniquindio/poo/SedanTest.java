package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SedanTest {

    @Test
    public void testCreacionSedan() {
        // Crear un objeto Sedan
        Sedan sedan = new Sedan(
            "Toyota", 
            "Corolla", 
            TipoCombustible.GASOLINA, 
            TipoTransmision.AUTOMATICA, 
            true, 
            180, 
            1600, 
            5, 
            4, 
            500, 
            true, 
            true, 
            true, 
            6, 
            true, 
            true, 
            true, 
            true, 
            true
        );

        // Verificar que los atributos se asignaron correctamente
        assertEquals("Toyota", sedan.getMarca());
        assertEquals("Corolla", sedan.getModelo());
        assertTrue(sedan.isNuevo());
        assertEquals(5, sedan.getNumeroPasajeros());
        assertTrue(sedan.isTieneAireAcondicionado());
        assertTrue(sedan.isTieneABS());
        assertEquals(500, sedan.getCapacidadMaletero());
    }

}
