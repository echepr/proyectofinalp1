package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CamionTest {

    private Camion camion;

    @BeforeEach
    void setUp() {
        // Inicializamos un objeto Camion antes de cada test
        camion = new Camion(
            "Scania", "R500", TipoCombustible.DIESEL, TipoTransmision.MANUAL,
            true, 120, 5000, 20000, true, true, true,
            4, "Camión de carga", true
        );
    }

    @Test
    void testConstructor() {
        // Verificar la correcta inicialización de los atributos
        assertEquals("Scania", camion.getMarca());
        assertEquals("R500", camion.getModelo());
        assertEquals(TipoCombustible.DIESEL, camion.getTipoCombustible());
        assertEquals(TipoTransmision.MANUAL, camion.getTipoTransmision());
        assertTrue(camion.isNuevo());
        assertEquals(120, camion.getVelocidadMaxima());
        assertEquals(5000, camion.getCilindrada());
        assertEquals(20000, camion.getCapacidadCarga());
        assertTrue(camion.isTieneAireAcondicionado());
        assertTrue(camion.isTieneFrenosAire());
        assertTrue(camion.isTieneABS());
        assertEquals(4, camion.getNumeroEjes());
        assertEquals("Camión de carga", camion.getTipoCamion());
        assertTrue(camion.isRevisionTecnica());
    }

    @Test
    void testSettersAndGetters() {
        // Probar setters y getters para asegurarse de que se actualizan correctamente
        camion.setCapacidadCarga(25000);
        camion.setTieneAireAcondicionado(false);
        camion.setTieneFrenosAire(false);
        camion.setTieneABS(false);
        camion.setNumeroEjes(6);
        camion.setTipoCamion("Camión cisterna");

        // Verificar que los valores establecidos se reflejan correctamente
        assertEquals(25000, camion.getCapacidadCarga());
        assertFalse(camion.isTieneAireAcondicionado());
        assertFalse(camion.isTieneFrenosAire());
        assertFalse(camion.isTieneABS());
        assertEquals(6, camion.getNumeroEjes());
        assertEquals("Camión cisterna", camion.getTipoCamion());
    }
}
