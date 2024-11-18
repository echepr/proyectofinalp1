package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
    private int numeroPasajeros; // Número de pasajeros que el bus puede transportar
    private int numeroPuertas; // Número de puertas del bus
    private int capacidadMaletero; // Capacidad del maletero en el bus
    private boolean tieneAireAcondicionado; // Indica si el bus tiene aire acondicionado
    private boolean tieneCamaraReversa; // Indica si el bus tiene cámara de reversa
    private int numeroBolsasAire; // Número de bolsas de aire en el bus
    private boolean tieneABS; // Indica si el bus tiene sistema de frenos ABS
    private int numeroEjes; // Número de ejes que tiene el bus
    private int numeroSalidasEmergencia; // Número de salidas de emergencia en el bus

    /**
     * Constructor de la clase Bus que inicializa todos los atributos del bus.
     * 
     * @param marca               Marca del bus
     * @param modelo              Modelo del bus
     * @param tipoCombustible     Tipo de combustible que utiliza el bus
     * @param tipoTransmision     Tipo de transmisión del bus
     * @param esNuevo             Indica si el bus es nuevo
     * @param velocidadMaxima     Velocidad máxima del bus
     * @param cilindrada          Cilindrada del bus
     * @param numeroPasajeros     Número de pasajeros que el bus puede transportar
     * @param numeroPuertas       Número de puertas del bus
     * @param capacidadMaletero   Capacidad del maletero en el bus
     * @param tieneAireAcondicionado Indica si el bus tiene aire acondicionado
     * @param tieneCamaraReversa  Indica si el bus tiene cámara de reversa
     * @param numeroBolsasAire    Número de bolsas de aire en el bus
     * @param tieneABS            Indica si el bus tiene frenos ABS
     * @param numeroEjes          Número de ejes del bus
     * @param numeroSalidasEmergencia Número de salidas de emergencia del bus
     * @param revisionTecnica     Indica si el bus tiene la revisión técnica
     */
    public Bus(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, boolean esNuevo, 
               int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, int capacidadMaletero, 
               boolean tieneAireAcondicionado, boolean tieneCamaraReversa, int numeroBolsasAire, boolean tieneABS, 
               int numeroEjes, int numeroSalidasEmergencia, boolean revisionTecnica) {
        super(marca, modelo, tipoCombustible, tipoTransmision, esNuevo, velocidadMaxima, cilindrada, revisionTecnica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    // Métodos getter y setter para los atributos de la clase Bus

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

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Devuelve una representación en cadena del bus, incluyendo todos sus atributos.
     * 
     * @return Representación en cadena de los atributos del bus.
     */
    @Override
    public String toString() {
        return super.toString() + ", Bus numeroPasajeros: " + numeroPasajeros + ", numeroPuertas: " + numeroPuertas + 
                ", capacidadMaletero: " + capacidadMaletero + ", tieneAireAcondicionado: " + tieneAireAcondicionado + 
                ", tieneCamaraReversa: " + tieneCamaraReversa + ", numeroBolsasAire: " + numeroBolsasAire + 
                ", tieneABS: " + tieneABS + ", numeroEjes: " + numeroEjes + ", numeroSalidasEmergencia: " + numeroSalidasEmergencia;
    }
}
