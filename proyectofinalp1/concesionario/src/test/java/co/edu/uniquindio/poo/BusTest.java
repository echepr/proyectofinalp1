package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

public class BusTest {
     @Test
    void testMostrarTipoVehiculo() {
        // Crear un objeto Bus
        Bus bus = new Bus("Volvo", "9700", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, false, 100, 6000,  50, 3, 3000, true, false, 8, true, 4, 3, true);

        // Capturamos la salida del método mostrarTipoVehiculo
        bus.toString();
    }
    

}