package co.edu.uniquindio.poo;

/**
 * Clase que representa a un vehículo dentro del sistema de gestión de concesionarios.
 * Un vehículo tiene características como la marca, modelo, tipo de combustible, tipo de transmisión,
 * si es nuevo o no, la velocidad máxima, la cilindrada, su estado de disponibilidad y su estado de revisión técnica.
 * Además, ofrece funcionalidades para registrar ventas y alquileres, verificando si el vehículo es apto para estas acciones.
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private TipoCombustible tipoCombustible;
    private TipoTransmision tipoTransmision;
    private boolean esNuevo;
    private int velocidadMaxima;
    private int cilindrada;
    private boolean disponible; // Atributo para marcar la disponibilidad del vehículo
    private boolean revisionTecnica; // Atributo para marcar si el vehículo ha pasado la revisión técnica

    /**
     * Constructor para crear un objeto Vehiculo con los valores especificados.
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param tipoCombustible Tipo de combustible utilizado por el vehículo.
     * @param tipoTransmision Tipo de transmisión del vehículo.
     * @param esNuevo Indica si el vehículo es nuevo o usado.
     * @param velocidadMaxima Velocidad máxima que puede alcanzar el vehículo.
     * @param cilindrada Cilindrada del motor del vehículo.
     * @param revisionTecnica Indica si el vehículo ha pasado la revisión técnica.
     */
    public Vehiculo(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, boolean esNuevo, int velocidadMaxima, int cilindrada, boolean revisionTecnica) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.tipoTransmision = tipoTransmision;
        this.esNuevo = esNuevo;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindrada = cilindrada;
        this.disponible = true; // Por defecto, el vehículo está disponible
        this.revisionTecnica = revisionTecnica;
    }

    /**
     * Registra la venta de un vehículo a un cliente.
     * Verifica que el vehículo esté disponible y haya pasado la revisión técnica.
     * @param cliente El cliente que está comprando el vehículo.
     */
    public void registrarVenta(Cliente cliente) {
        if (esVehiculoApto() && revisionTecnica) { // Verificar que haya pasado la revisión técnica
            System.out.println("Venta realizada con éxito a " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no es apto para la venta o no ha pasado la revisión técnica.");
        }
    }

    /**
     * Registra el alquiler de un vehículo a un cliente por un número específico de días.
     * Verifica que el vehículo esté disponible para alquiler.
     * @param cliente El cliente que está alquilando el vehículo.
     * @param duracionDias La duración del alquiler en días.
     */
    public void registrarAlquiler(Cliente cliente, int duracionDias) {
        if (esVehiculoApto()) {
            System.out.println("Alquiler realizado con éxito a " + cliente.getNombre() + " por " + duracionDias + " días.");
        } else {
            System.out.println("El vehículo no es apto para el alquiler.");
        }
    }

    /**
     * Verifica si el vehículo está disponible para ser vendido o alquilado.
     * @return true si el vehículo está disponible, false en caso contrario.
     */
    public boolean esVehiculoApto() {
        return disponible; // Un vehículo es apto solo si está disponible
    }

    // Métodos getter y setter para acceder y modificar los atributos del vehículo

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public boolean isNuevo() {
        return esNuevo; 
    }

    public void setEsNuevo(boolean esNuevo) { 
        this.esNuevo = esNuevo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    /**
     * Devuelve una representación en cadena de caracteres del objeto Vehiculo.
     * @return Una cadena que describe los atributos del vehículo.
     */
    @Override
    public String toString() {
        return "Vehiculo marca: " + marca + ", modelo: " + modelo + ", tipoCombustible: " + tipoCombustible
                + ", tipoTransmision: " + tipoTransmision + ", esNuevo: " + esNuevo + ", velocidadMaxima: " + velocidadMaxima 
                + ", cilindrada: " + cilindrada + ", disponible: " + disponible + ", revisión técnica: " + revisionTecnica;
    }
}
