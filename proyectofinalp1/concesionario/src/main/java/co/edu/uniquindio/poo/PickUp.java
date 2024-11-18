package co.edu.uniquindio.poo;

/**
 * La clase `PickUp` representa un tipo específico de vehículo que hereda de la clase `Vehiculo` y
 * implementa la interfaz `IVehiculo`. Esta clase está diseñada para almacenar las propiedades y comportamientos
 * asociados a un vehículo de tipo Pick Up, como el número de pasajeros, puertas, características de seguridad,
 * y otras particularidades del modelo.
 */
public class PickUp extends Vehiculo {
    
    // Atributos de la clase PickUp
    private int numeroPasajeros;              // Número de pasajeros que puede transportar el vehículo.
    private int numeroPuertas;                // Número de puertas del vehículo.
    private boolean tieneAireAcondicionado;   // Indica si el vehículo tiene aire acondicionado.
    private boolean tieneCamaraReversa;       // Indica si el vehículo tiene cámara de reversa.
    private int numeroBolsasAire;             // Número de bolsas de aire con las que cuenta el vehículo.
    private boolean tieneABS;                 // Indica si el vehículo tiene sistema de frenos ABS.
    private boolean es4x4;                    // Indica si el vehículo es de tracción 4x4.
    private int capacidadCajaCarga;           // Capacidad de la caja de carga en el vehículo.

    /**
     * Constructor de la clase `PickUp`.
     * 
     * @param marca                  Marca del vehículo.
     * @param modelo                 Modelo del vehículo.
     * @param tipoCombustible        Tipo de combustible del vehículo.
     * @param tipoTransmision        Tipo de transmisión del vehículo.
     * @param esNuevo                Indica si el vehículo es nuevo.
     * @param velocidadMaxima        Velocidad máxima del vehículo.
     * @param cilindrada             Cilindrada del motor del vehículo.
     * @param numeroPasajeros        Número de pasajeros que puede transportar.
     * @param numeroPuertas          Número de puertas del vehículo.
     * @param tieneAireAcondicionado Indica si tiene aire acondicionado.
     * @param tieneCamaraReversa     Indica si tiene cámara de reversa.
     * @param numeroBolsasAire       Número de bolsas de aire.
     * @param tieneABS               Indica si tiene sistema de frenos ABS.
     * @param es4x4                  Indica si el vehículo es de tracción 4x4.
     * @param capacidadCajaCarga     Capacidad de la caja de carga.
     * @param revisionTecnica        Indica si el vehículo pasó la revisión técnica.
     */
    public PickUp(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, boolean esNuevo, int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, int numeroBolsasAire, boolean tieneABS, boolean es4x4, int capacidadCajaCarga, boolean revisionTecnica) {
        super(marca, modelo, tipoCombustible, tipoTransmision, esNuevo, velocidadMaxima, cilindrada, revisionTecnica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
        this.es4x4 = es4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
    // Métodos Getter y Setter para los atributos

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Método `toString` para obtener la representación en texto del objeto.
     * 
     * @return Una cadena con los detalles del PickUp.
     */
    @Override
    public String toString() {
        return super.toString() + ", PickUp numeroPasajeros: " + numeroPasajeros + ", numeroPuertas: " + numeroPuertas
                + ", tieneAireAcondicionado: " + tieneAireAcondicionado + ", tieneCamaraReversa: " + tieneCamaraReversa
                + ", numeroBolsasAire: " + numeroBolsasAire + ", tieneABS: " + tieneABS + ", es4x4: " + es4x4
                + ", capacidadCajaCarga: " + capacidadCajaCarga + "";
    }
}
