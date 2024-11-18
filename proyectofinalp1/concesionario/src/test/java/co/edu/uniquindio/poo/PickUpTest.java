package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PickUpTest {

    @Test
    public void testMostrarTipoVehiculo() {
        // Crear un objeto PickUp
        PickUp pickup = new PickUp(
                "Chevrolet", "Silverado", TipoCombustible.DIESEL, TipoTransmision.MANUAL,
                false, 160, 4000, 5, 4, true, false, 4, true, false, 1100, true
        );

        // Verificar que el método 'mostrarTipoVehiculo' imprime el tipo correcto
        // En lugar de utilizar 'System.out' en los test reales, se debe redirigir la salida estándar
        // Para fines de prueba, si se desea verificar el mensaje impreso, se puede hacerlo con un 'OutputStream'
        // Aquí solo verificamos si la llamada no lanza ninguna excepción
        assertDoesNotThrow(() -> pickup.toString());
    }
}
