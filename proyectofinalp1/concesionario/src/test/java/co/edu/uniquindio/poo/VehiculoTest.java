package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

 

    @Test
    void testEsVehiculoApto_Disponible() {
        Vehiculo vehiculo = new Vehiculo(
                "Toyota",
                "Corolla",
                TipoCombustible.GASOLINA,
                TipoTransmision.MANUAL,
                true,
                180,
                2000,
                true
        );

        vehiculo.setDisponible(true); // Hacer que el vehículo esté disponible
        assertTrue(vehiculo.esVehiculoApto(), "El vehículo debería ser apto cuando está disponible.");
    }

    @Test
    void testEsVehiculoApto_NoDisponible() {
        Vehiculo vehiculo = new Vehiculo(
                "Toyota",
                "Corolla",
                TipoCombustible.GASOLINA,
                TipoTransmision.MANUAL,
                true,
                180,
                2000,
                true
        );

        vehiculo.setDisponible(false); // Hacer que el vehículo no esté disponible
        assertFalse(vehiculo.esVehiculoApto(), "El vehículo no debería ser apto cuando no está disponible.");
    }
}
