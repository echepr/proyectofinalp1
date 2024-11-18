package co.edu.uniquindio.poo;

/**
 * La clase Sedan representa un vehículo de tipo sedán, que hereda de la clase Vehiculo
 * e implementa la interfaz IVehiculo. Contiene detalles adicionales específicos para los sedanes,
 * como el número de pasajeros, puertas, características de seguridad y confort, entre otras.
 */
public class Sedan extends Vehiculo {

    // Atributos específicos del sedán
    private int numeroPasajeros; // Número de pasajeros que puede transportar el sedán
    private int numeroPuertas; // Número de puertas del sedán
    private int capacidadMaletero; // Capacidad del maletero en litros
    private boolean tieneAireAcondicionado; // Si el sedán tiene aire acondicionado
    private boolean tieneCamaraReversa; // Si el sedán tiene cámara de reversa
    private boolean tieneVelocidadCrucero; // Si el sedán tiene velocidad de crucero
    private int numeroBolsasAire; // Número de bolsas de aire del sedán
    private boolean tieneABS; // Si el sedán tiene sistema de frenos ABS
    private boolean tieneSensoresColision; // Si el sedán tiene sensores de colisión
    private boolean tieneSensorTraficoCruzado; // Si el sedán tiene sensor de tráfico cruzado
    private boolean tieneAsistenteCarril; // Si el sedán tiene asistente de carril

    /**
     * Constructor para crear un nuevo objeto de tipo Sedan.
     * 
     * @param marca El nombre de la marca del vehículo.
     * @param modelo El modelo del vehículo.
     * @param tipoCombustible El tipo de combustible que utiliza el vehículo (por ejemplo, gasolina, diésel, eléctrico).
     * @param tipoTransmision El tipo de transmisión del vehículo (por ejemplo, automática, manual).
     * @param esNuevo Indica si el vehículo es nuevo o usado.
     * @param velocidadMaxima La velocidad máxima del vehículo.
     * @param cilindrada La cilindrada del motor del vehículo.
     * @param numeroPasajeros El número de pasajeros que puede transportar el sedán.
     * @param numeroPuertas El número de puertas del sedán.
     * @param capacidadMaletero La capacidad del maletero en litros.
     * @param tieneAireAcondicionado Si el sedán tiene aire acondicionado.
     * @param tieneCamaraReversa Si el sedán tiene cámara de reversa.
     * @param tieneVelocidadCrucero Si el sedán tiene velocidad de crucero.
     * @param numeroBolsasAire El número de bolsas de aire del sedán.
     * @param tieneABS Si el sedán tiene sistema de frenos ABS.
     * @param tieneSensoresColision Si el sedán tiene sensores de colisión.
     * @param tieneSensorTraficoCruzado Si el sedán tiene sensor de tráfico cruzado.
     * @param tieneAsistenteCarril Si el sedán tiene asistente de carril.
     * @param revisionTecnica Si el sedán ha pasado la revisión técnica.
     */
    public Sedan(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, boolean esNuevo, int velocidadMaxima, int cilindrada, 
                 int numeroPasajeros, int numeroPuertas, int capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, 
                 boolean tieneVelocidadCrucero, int numeroBolsasAire, boolean tieneABS, boolean tieneSensoresColision, 
                 boolean tieneSensorTraficoCruzado, boolean tieneAsistenteCarril, boolean revisionTecnica) {
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
    }

    // Métodos getter y setter para los atributos específicos del sedán

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

    /**
     * Devuelve una representación en forma de cadena del objeto Sedan, incluyendo la información
     * de la clase padre (Vehiculo) y los atributos específicos del sedán.
     * 
     * @return Una cadena que representa el objeto Sedan.
     */
    @Override
    public String toString() {
        return super.toString() + ", Sedan numeroPasajeros: " + numeroPasajeros + ", numeroPuertas:" + numeroPuertas + ", capacidadMaletero: "
                + capacidadMaletero + ", tieneAireAcondicionado: " + tieneAireAcondicionado + ", tieneCamaraReversa: "
                + tieneCamaraReversa + ", tieneVelocidadCrucero: " + tieneVelocidadCrucero + ", numeroBolsasAire: "
                + numeroBolsasAire + ", tieneABS: " + tieneABS + ", tieneSensoresColision: " + tieneSensoresColision
                + ", tieneSensorTraficoCruzado: " + tieneSensorTraficoCruzado + ", tieneAsistenteCarril: "
                + tieneAsistenteCarril + "";
    }

}
