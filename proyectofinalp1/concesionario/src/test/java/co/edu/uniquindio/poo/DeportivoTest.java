package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeportivoTest {

@Test
    public void testCreacionDeportivo() {
        // Crear un vehículo deportivo de prueba
        Deportivo deportivo = new Deportivo("Ferrari", "488 GTB", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, true, 330, 3800, 2, 2, 6, 670, 3.0, true);
        
        // Verificar los valores de los atributos
        assertEquals("Ferrari", deportivo.getMarca(), "La marca debería ser Ferrari.");
        assertEquals("488 GTB", deportivo.getModelo(), "El modelo debería ser 488 GTB.");
        assertTrue(deportivo.isNuevo(), "El vehículo debería ser nuevo.");
        assertEquals(330, deportivo.getVelocidadMaxima(), "La velocidad máxima debería ser 330.");
        assertEquals(2, deportivo.getNumeroPasajeros(), "El número de pasajeros debería ser 2.");
    }
@Test
    public void testMostrarTipoVehiculo() {
        // Crear un vehículo deportivo de prueba
        Deportivo deportivo = new Deportivo("Ferrari", "488 GTB", TipoCombustible.GASOLINA, TipoTransmision.AUTOMATICA, true, 330, 3800, 2, 2, 6, 670, 3.0, true);
        
        // Llamar al método mostrarTipoVehiculo
        deportivo.toString(); // Este método debe ejecutar correctamente
    }
}