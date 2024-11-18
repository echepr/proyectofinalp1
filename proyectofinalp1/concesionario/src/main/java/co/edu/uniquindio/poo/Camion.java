package co.edu.uniquindio.poo;

/**
 * Representa un camión, que es un tipo específico de vehículo con características 
 * adicionales como capacidad de carga, número de ejes, y sistemas de seguridad y confort.
 * Extiende la clase {@link Vehiculo} e implementa la interfaz {@link IVehiculo}.
 */
public class Camion extends Vehiculo {

    /**
     * Capacidad máxima de carga del camión en kilogramos.
     */
    private int capacidadCarga;

    /**
     * Indica si el camión tiene aire acondicionado.
     */
    private boolean tieneAireAcondicionado;

    /**
     * Indica si el camión tiene frenos de aire.
     */
    private boolean tieneFrenosAire;

    /**
     * Indica si el camión tiene sistema de frenos antibloqueo (ABS).
     */
    private boolean tieneABS;

    /**
     * Número de ejes que tiene el camión.
     */
    private int numeroEjes;

    /**
     * Tipo de camión (por ejemplo, camión de carga, camión cisterna, etc.).
     */
    private String tipoCamion;

    /**
     * Constructor de la clase Camion, que inicializa todos los atributos del camión.
     * 
     * @param marca               Marca del camión.
     * @param modelo              Modelo del camión.
     * @param tipoCombustible     Tipo de combustible del camión.
     * @param tipoTransmision     Tipo de transmisión del camión.
     * @param esNuevo             Indica si el camión es nuevo o usado.
     * @param velocidadMaxima     Velocidad máxima del camión en km/h.
     * @param cilindrada          Cilindrada del motor en cm³.
     * @param capacidadCarga      Capacidad de carga del camión en kilogramos.
     * @param tieneAireAcondicionado Indica si el camión tiene aire acondicionado.
     * @param tieneFrenosAire     Indica si el camión tiene frenos de aire.
     * @param tieneABS            Indica si el camión tiene frenos ABS.
     * @param numeroEjes          Número de ejes del camión.
     * @param tipoCamion          Tipo de camión (por ejemplo, camión de carga).
     * @param revisionTecnica     Indica si el camión tiene la revisión técnica al día.
     */
    public Camion(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, boolean esNuevo, int velocidadMaxima, int cilindrada,  int capacidadCarga, boolean tieneAireAcondicionado, boolean tieneFrenosAire, boolean tieneABS,  int numeroEjes, String tipoCamion, boolean revisionTecnica) {
        super(marca, modelo, tipoCombustible, tipoTransmision, esNuevo, velocidadMaxima, cilindrada, revisionTecnica);
        this.capacidadCarga = capacidadCarga;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneFrenosAire = tieneFrenosAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    /**
     * Obtiene la capacidad de carga del camión.
     * 
     * @return La capacidad de carga en kilogramos.
     */
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Establece la capacidad de carga del camión.
     * 
     * @param capacidadCarga La capacidad de carga en kilogramos.
     */
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Obtiene si el camión tiene aire acondicionado.
     * 
     * @return {@code true} si tiene aire acondicionado, {@code false} si no lo tiene.
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * Establece si el camión tiene aire acondicionado.
     * 
     * @param tieneAireAcondicionado {@code true} para indicar que tiene aire acondicionado, 
     *                               {@code false} para indicar lo contrario.
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * Obtiene si el camión tiene frenos de aire.
     * 
     * @return {@code true} si tiene frenos de aire, {@code false} si no los tiene.
     */
    public boolean isTieneFrenosAire() {
        return tieneFrenosAire;
    }

    /**
     * Establece si el camión tiene frenos de aire.
     * 
     * @param tieneFrenosAire {@code true} para indicar que tiene frenos de aire, 
     *                        {@code false} para indicar lo contrario.
     */
    public void setTieneFrenosAire(boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
    }

    /**
     * Obtiene si el camión tiene sistema de frenos antibloqueo (ABS).
     * 
     * @return {@code true} si tiene frenos ABS, {@code false} si no los tiene.
     */
    public boolean isTieneABS() {
        return tieneABS;
    }

    /**
     * Establece si el camión tiene frenos ABS.
     * 
     * @param tieneABS {@code true} para indicar que tiene frenos ABS, 
     *                 {@code false} para indicar lo contrario.
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    /**
     * Obtiene el número de ejes del camión.
     * 
     * @return El número de ejes del camión.
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Establece el número de ejes del camión.
     * 
     * @param numeroEjes El número de ejes del camión.
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Obtiene el tipo de camión (por ejemplo, camión de carga, camión cisterna, etc.).
     * 
     * @return El tipo de camión.
     */
    public String getTipoCamion() {
        return tipoCamion;
    }

    
    
    /**
     * Genera una representación en cadena del camión, incluyendo todos los atributos 
     * relevantes de la clase {@link Vehiculo} y los atributos específicos del camión.
     * 
     * @return Una cadena representando al camión.
     */
    @Override
    public String toString() {
        return super.toString() + ", Camion capacidadCarga: " + capacidadCarga + ", tieneAireAcondicionado: " + tieneAireAcondicionado
                + ", tieneFrenosAire: " + tieneFrenosAire + ", tieneABS: " + tieneABS + ", numeroEjes: " + numeroEjes
                + ", tipoCamion: " + tipoCamion + "";
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
}
