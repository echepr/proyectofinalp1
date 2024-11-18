package co.edu.uniquindio.poo;

/**
 * Clase que representa una camioneta (vehículo) y sus características específicas.
 * Esta clase hereda de la clase Vehiculo e implementa la interfaz IVehiculo.
 */
public class Camioneta extends Vehiculo {
    
    // Atributos específicos de la clase Camioneta
    private int numeroPasajeros; // Número de pasajeros que puede transportar la camioneta
    private int numeroPuertas; // Número de puertas de la camioneta
    private int capacidadMaletero; // Capacidad del maletero en litros
    private boolean tieneAireAcondicionado; // Indica si la camioneta tiene aire acondicionado
    private boolean tieneCamaraReversa; // Indica si la camioneta tiene cámara de reversa
    private boolean tieneVelocidadCrucero; // Indica si la camioneta tiene control de velocidad crucero
    private int numeroBolsasAire; // Número de bolsas de aire que tiene la camioneta
    private boolean tieneABS; // Indica si la camioneta tiene sistema de frenos antibloqueo (ABS)
    private boolean tieneSensoresColision; // Indica si la camioneta tiene sensores de colisión
    private boolean tieneSensorTraficoCruzado; // Indica si la camioneta tiene sensor de tráfico cruzado
    private boolean tieneAsistenteCarril; // Indica si la camioneta tiene asistente de carril
    private boolean es4x4; // Indica si la camioneta es de tracción en las 4 ruedas (4x4)

    /**
     * Constructor de la clase Camioneta.
     * 
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param tipoCombustible Tipo de combustible del vehículo (Gasolina, Diesel, Eléctrico, etc.).
     * @param tipoTransmision Tipo de transmisión del vehículo (Manual, Automática).
     * @param esNuevo Indica si el vehículo es nuevo o usado.
     * @param velocidadMaxima Velocidad máxima del vehículo en km/h.
     * @param cilindrada Cilindrada del motor en cc.
     * @param numeroPasajeros Número de pasajeros que puede transportar.
     * @param numeroPuertas Número de puertas del vehículo.
     * @param capacidadMaletero Capacidad del maletero en litros.
     * @param tieneAireAcondicionado Indica si el vehículo tiene aire acondicionado.
     * @param tieneCamaraReversa Indica si el vehículo tiene cámara de reversa.
     * @param tieneVelocidadCrucero Indica si el vehículo tiene control de velocidad crucero.
     * @param numeroBolsasAire Número de bolsas de aire.
     * @param tieneABS Indica si el vehículo tiene sistema de frenos antibloqueo (ABS).
     * @param tieneSensoresColision Indica si el vehículo tiene sensores de colisión.
     * @param tieneSensorTraficoCruzado Indica si el vehículo tiene sensor de tráfico cruzado.
     * @param tieneAsistenteCarril Indica si el vehículo tiene asistente de carril.
     * @param es4x4 Indica si el vehículo tiene tracción en las 4 ruedas (4x4).
     * @param revisionTecnica Indica si el vehículo tiene revisión técnica vigente.
     */
    public Camioneta(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision,
                     boolean esNuevo, int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, 
                     int capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, 
                     boolean tieneVelocidadCrucero, int numeroBolsasAire, boolean tieneABS, boolean tieneSensoresColision,
                     boolean tieneSensorTraficoCruzado, boolean tieneAsistenteCarril, boolean es4x4, boolean revisionTecnica) {
        super(marca, modelo, tipoCombustible, tipoTransmision, esNuevo, velocidadMaxima, cilindrada, revisionTecnica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
        this.tieneSensoresColision = tieneSensoresColision;
        this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
        this.tieneAsistenteCarril = tieneAsistenteCarril;
        this.es4x4 = es4x4;
    }

    // Métodos getter y setter para los atributos de la camioneta

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

    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
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

    public boolean isTieneSensoresColision() {
        return tieneSensoresColision;
    }

    public void setTieneSensoresColision(boolean tieneSensoresColision) {
        this.tieneSensoresColision = tieneSensoresColision;
    }

    public boolean isTieneSensorTraficoCruzado() {
        return tieneSensorTraficoCruzado;
    }

    public void setTieneSensorTraficoCruzado(boolean tieneSensorTraficoCruzado) {
        this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
    }

    public boolean isTieneAsistenteCarril() {
        return tieneAsistenteCarril;
    }

    public void setTieneAsistenteCarril(boolean tieneAsistenteCarril) {
        this.tieneAsistenteCarril = tieneAsistenteCarril;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    /**
     * Método toString que genera una representación en forma de cadena de la camioneta,
     * incluyendo los atributos heredados de la clase Vehiculo y los atributos específicos de Camioneta.
     * 
     * @return Cadena con la información de la camioneta.
     */
    @Override
    public String toString() {
        return super.toString() + ", Camioneta numeroPasajeros: " + numeroPasajeros + ", numeroPuertas: " + numeroPuertas
                + ", capacidadMaletero: " + capacidadMaletero + ", tieneAireAcondicionado: " + tieneAireAcondicionado
                + ", tieneCamaraReversa: " + tieneCamaraReversa + ", tieneVelocidadCrucero: " + tieneVelocidadCrucero
                + ", numeroBolsasAire: " + numeroBolsasAire + ", tieneABS:" + tieneABS + ", tieneSensoresColision: "
                + tieneSensoresColision + ", tieneSensorTraficoCruzado: " + tieneSensorTraficoCruzado
                + ", tieneAsistenteCarril: " + tieneAsistenteCarril + ", es4x4: " + es4x4;
    }
}
