package co.edu.uniquindio.poo;

/**
 * La clase Transaccion representa una transacción realizada entre un cliente y un vehículo.
 * Una transacción puede ser de tipo venta, alquiler o compra, y contiene detalles como el cliente,
 * el vehículo involucrado, el tipo de transacción y la fecha en que ocurrió.
 */
public class Transaccion {
    private Cliente cliente; // Cliente involucrado en la transacción
    private Vehiculo vehiculo; // Vehículo involucrado en la transacción
    private TipoTransaccion tipo; // Tipo de transacción (Venta, Alquiler, Compra)
    private String fecha; // Fecha de la transacción en formato YYYY-MM-DD

    /**
     * Constructor para crear una nueva transacción.
     * 
     * @param cliente El cliente que participa en la transacción.
     * @param vehiculo El vehículo involucrado en la transacción.
     * @param tipo El tipo de transacción (Venta, Alquiler, Compra).
     * @param fecha La fecha de la transacción en formato YYYY-MM-DD.
     */
    public Transaccion(Cliente cliente, Vehiculo vehiculo, TipoTransaccion tipo, String fecha) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    /**
     * Obtiene el tipo de la transacción.
     * 
     * @return El tipo de transacción (Venta, Alquiler, Compra).
     */
    public TipoTransaccion getTipo() {
        return tipo;
    }

    /**
     * Obtiene la fecha de la transacción.
     * 
     * @return La fecha de la transacción en formato YYYY-MM-DD.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Obtiene el cliente involucrado en la transacción.
     * 
     * @return El cliente asociado a la transacción.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente involucrado en la transacción.
     * 
     * @param cliente El cliente a asociar con la transacción.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el vehículo involucrado en la transacción.
     * 
     * @return El vehículo asociado a la transacción.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo involucrado en la transacción.
     * 
     * @param vehiculo El vehículo a asociar con la transacción.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Establece la fecha de la transacción.
     * 
     * @param fecha La nueva fecha para la transacción, en formato YYYY-MM-DD.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve una representación en forma de cadena de la transacción.
     * 
     * @return Una cadena que representa la transacción, incluyendo el cliente, el vehículo, el tipo y la fecha.
     */
    @Override
    public String toString() {
        return "Transaccion cliente=" + cliente + ", vehiculo=" + vehiculo + ", tipo=" + tipo + ", fecha=" + fecha
                + "";
    }
}
