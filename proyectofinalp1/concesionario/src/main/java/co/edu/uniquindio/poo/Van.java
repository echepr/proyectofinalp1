package co.edu.uniquindio.poo;

/**
 * Clase que representa una van, un tipo específico de vehículo.
 * La clase hereda de la clase Vehiculo e implementa la interfaz IVehiculo.
 * Un objeto de tipo Van tiene características adicionales como el número de pasajeros, el número de puertas,
 * la capacidad del maletero, entre otras características de seguridad y confort.
 */
public class Van extends Vehiculo {
    
    // Atributos específicos de la clase Van
    private int numeroPasajeros; // Número de pasajeros que puede transportar la van.
    private int numeroPuertas; // Número de puertas que tiene la van.
    private int capacidadMaletero; // Capacidad del maletero en litros.
    private boolean tieneAireAcondicionado; // Indica si la van tiene aire acondicionado.
    private boolean tieneCamaraReversa; // Indica si la van tiene cámara de reversa.
    private int numeroBolsasAire; // Número de bolsas de aire que tiene la van.
    private boolean tieneABS; // Indica si la van tiene sistema de frenos ABS.

    /**
     * Constructor para crear una van con todos sus atributos.
     * Este constructor llama al constructor de la clase base Vehiculo para inicializar sus atributos.
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param tipoCombustible Tipo de combustible utilizado por la van.
     * @param tipoTransmision Tipo de transmisión de la van.
     * @param esNuevo Indica si la van es nueva o usada.
     * @param velocidadMaxima Velocidad máxima de la van.
     * @param cilindrada Cilindrada del motor de la van.
     * @param revisionTecnica Indica si la van ha pasado la revisión técnica.
     * @param numeroPasajeros Número de pasajeros que puede transportar la van.
     * @param numeroPuertas Número de puertas de la van.
     * @param capacidadMaletero Capacidad del maletero en litros.
     * @param tieneAireAcondicionado Indica si la van tiene aire acondicionado.
     * @param tieneCamaraReversa Indica si la van tiene cámara de reversa.
     * @param numeroBolsasAire Número de bolsas de aire de la van.
     * @param tieneABS Indica si la van tiene sistema de frenos ABS.
     */
    public Van(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, boolean esNuevo, 
               int velocidadMaxima, int cilindrada, boolean revisionTecnica, int numeroPasajeros, int numeroPuertas, 
               int capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, int numeroBolsasAire, 
               boolean tieneABS) {
        super(marca, modelo, tipoCombustible, tipoTransmision, esNuevo, velocidadMaxima, cilindrada, revisionTecnica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
    }
    // Métodos getter y setter para acceder y modificar los atributos de la Van

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

    /**
     * Devuelve una representación en cadena de caracteres del objeto Van.
     * Llama al método `toString` de la clase base Vehiculo para obtener los atributos generales del vehículo,
     * y agrega la información específica de la Van, como el número de pasajeros, puertas, capacidad del maletero, 
     * características de confort y seguridad.
     * @return Una cadena que describe los atributos del vehículo Van.
     */
    @Override
    public String toString() {
        // Llamamos a super.toString() para obtener la información de la clase base (Vehiculo)
        return super.toString() + ", Van numeroPasajeros: " + numeroPasajeros + ", numeroPuertas: " + numeroPuertas + 
               ", capacidadMaletero: " + capacidadMaletero + ", tieneAireAcondicionado: " + tieneAireAcondicionado + 
               ", tieneCamaraReversa: " + tieneCamaraReversa + ", numeroBolsasAire: " + numeroBolsasAire + 
               ", tieneABS: " + tieneABS;
    }
}
