package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VanTest {

    /**
     * Test que verifica la creación de un objeto de la clase Van.
     * Se comprueba que los atributos se inicializan correctamente
     * con los valores proporcionados al constructor.
     */
    @Test
    void testCrearVan() {
        // Crear una instancia de Van con valores iniciales
        Van van = new Van(
                "Ford",                     // Marca
                "Transit",                  // Modelo
                TipoCombustible.DIESEL,     // Tipo de combustible
                TipoTransmision.AUTOMATICA, // Tipo de transmisión
                true,                       // Es nuevo
                160,                        // Velocidad máxima
                2200,                       // Cilindrada
                true,                       // Revisión técnica aprobada
                12,                         // Número de pasajeros
                5,                          // Número de puertas
                1500,                       // Capacidad del maletero
                true,                       // Tiene aire acondicionado
                true,                       // Tiene cámara de reversa
                6,                          // Número de bolsas de aire
                true                        // Tiene sistema ABS
        );

        // Validar que los atributos se han inicializado correctamente
        assertEquals("Ford", van.getMarca()); // Comprobar marca
        assertEquals("Transit", van.getModelo()); // Comprobar modelo
        assertEquals(12, van.getNumeroPasajeros()); // Comprobar número de pasajeros
        assertTrue(van.isTieneAireAcondicionado()); // Verificar aire acondicionado
        assertTrue(van.isTieneABS()); // Verificar sistema ABS
    }

    /**
     * Test que verifica la modificación del atributo capacidadMaletero
     * en un objeto de la clase Van. Se utiliza el método set para actualizar
     * el valor y luego se valida con el método get.
     */
    @Test
    void testActualizarCapacidadMaletero() {
        // Crear una instancia de Van con valores iniciales
        Van van = new Van(
                "Toyota",                   // Marca
                "Hiace",                    // Modelo
                TipoCombustible.GASOLINA,   // Tipo de combustible
                TipoTransmision.MANUAL,     // Tipo de transmisión
                true,                       // Es nuevo
                140,                        // Velocidad máxima
                2500,                       // Cilindrada
                true,                       // Revisión técnica aprobada
                10,                         // Número de pasajeros
                4,                          // Número de puertas
                1200,                       // Capacidad del maletero
                false,                      // No tiene aire acondicionado
                true,                       // Tiene cámara de reversa
                4,                          // Número de bolsas de aire
                true                        // Tiene sistema ABS
        );

        // Actualizar la capacidad del maletero
        van.setCapacidadMaletero(2000);

        // Validar que el atributo capacidadMaletero se ha actualizado correctamente
        assertEquals(2000, van.getCapacidadMaletero());
    }
}
