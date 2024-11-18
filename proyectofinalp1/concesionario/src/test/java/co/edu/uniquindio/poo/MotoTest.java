package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MotoTest {
    
@Test
    public void testConstructorYGetters() {
        // Crear un objeto Moto
        Moto moto = new Moto("Yamaha", "YZF-R3", true, TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 150, 321, true);

        // Verificar los valores de los atributos a través de los getters
        assertEquals("Yamaha", moto.getMarca());
        assertEquals("YZF-R3", moto.getModelo());
        assertTrue(moto.isNuevo());
        assertEquals(TipoCombustible.GASOLINA, moto.getTipoCombustible());
        assertEquals(TipoTransmision.MANUAL, moto.getTipoTransmision());
        assertEquals(150, moto.getVelocidadMaxima());
        assertEquals(321, moto.getCilindrada());
        assertTrue(moto.isRevisionTecnica());
    }

 @Test
    public void testEsVehiculoApto() {
        // Crear un objeto Moto con velocidad mayor a 100 y nuevo
        Moto motoApta = new Moto("Kawasaki", "Ninja 300", true, TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 150, 399, true);
        assertTrue(motoApta.esVehiculoApto(), "La moto debería ser apta");

        // Crear un objeto Moto con velocidad menor a 100 y nuevo
        Moto motoNoApta = new Moto("Honda", "CBR500R", true, TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 90, 500, true);
        assertFalse(motoNoApta.esVehiculoApto(), "La moto no debería ser apta");

        // Crear un objeto Moto con velocidad mayor a 100 pero no nueva
        Moto motoNoApta2 = new Moto("Suzuki", "GSX-R600", false, TipoCombustible.GASOLINA, TipoTransmision.MANUAL, 150, 600, false);
        assertFalse(motoNoApta2.esVehiculoApto(), "La moto no debería ser apta, ya que no es nueva");
    }
  
    
}
