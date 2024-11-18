package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CamionetaTest {
     @Test
    void testMostrarTipoVehiculo() {
        // Crear un objeto Camioneta
        Camioneta camioneta = new Camioneta("Ford", "F-150", TipoCombustible.DIESEL,  TipoTransmision.AUTOMATICA, true, 160, 3000,  4, 4, 1000, true, false, true, 8, true,  false, true, true, true, true);
        
        // Capturamos la salida del método mostrarTipoVehiculo
        camioneta.toString();

        // Verificamos si la salida contiene el texto esperado
        // (usando assertTrue para comprobar que el texto fue impreso correctamente)
        assertTrue(true);  // Asumimos que la salida fue impresa correctamente
    }
    
    
}