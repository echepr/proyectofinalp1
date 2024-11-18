package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransaccionTest {
    /**
 * Test para verificar la creación de una transacción con un cliente válido.
 */
@Test
public void testCrearTransaccion() {
    // Crear un cliente (hereda atributos de Persona)
    Cliente cliente = new Cliente("Juan", "Pérez", "1234567890", "3001234567");

    // Crear un vehículo
    Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", TipoCombustible.GASOLINA, TipoTransmision.MANUAL, true, 180, 1600, true);

    // Crear la transacción
    Transaccion transaccion = new Transaccion(cliente, vehiculo, TipoTransaccion.COMPRA, "2024-11-18");

    // Verificar que la transacción se haya creado correctamente
    assertNotNull(transaccion.getCliente()); // Verifica que el cliente no es nulo
    assertEquals("Juan", transaccion.getCliente().getNombre()); // Verifica el nombre del cliente
    assertNotNull(transaccion.getVehiculo()); // Verifica que el vehículo no es nulo
    assertEquals("Toyota", transaccion.getVehiculo().getMarca()); // Verifica la marca del vehículo
    assertEquals("2024-11-18", transaccion.getFecha()); // Verifica la fecha de la transacción
}
}
