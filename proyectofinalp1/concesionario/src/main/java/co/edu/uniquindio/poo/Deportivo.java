package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    
    // Atributos específicos de la clase Deportivo
    private int numeroPasajeros;         // Número de pasajeros que el vehículo puede transportar
    private int numeroPuertas;           // Número de puertas del vehículo
    private int numeroBolsasAire;        // Número de bolsas de aire del vehículo para seguridad
    private int caballosFuerza;          // Cantidad de caballos de fuerza del vehículo, indicador de potencia
    private double tiempoCienKmH;        // Tiempo que tarda el vehículo en alcanzar los 100 km/h

    /**
     * Constructor de la clase Deportivo.
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param tipoCombustible Tipo de combustible que utiliza el vehículo
     * @param tipoTransmision Tipo de transmisión del vehículo
     * @param esNuevo Indica si el vehículo es nuevo
     * @param velocidadMaxima Velocidad máxima del vehículo
     * @param cilindrada Cilindrada del motor del vehículo
     * @param numeroPasajeros Número de pasajeros que el vehículo puede transportar
     * @param numeroPuertas Número de puertas del vehículo
     * @param numeroBolsasAire Número de bolsas de aire del vehículo
     * @param caballosFuerza Potencia del vehículo en caballos de fuerza
     * @param tiempoCienKmH Tiempo que tarda el vehículo en acelerar de 0 a 100 km/h
     * @param revisionTecnica Indica si el vehículo ha pasado la revisión técnica
     */
    public Deportivo(String marca, String modelo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, 
                     boolean esNuevo, int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, 
                     int numeroBolsasAire, int caballosFuerza, double tiempoCienKmH, boolean revisionTecnica) {
        super(marca, modelo, tipoCombustible, tipoTransmision, esNuevo, velocidadMaxima, cilindrada, revisionTecnica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKmH = tiempoCienKmH;
    }

    // Métodos getter y setter para cada atributo

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

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getTiempoCienKmH() {
        return tiempoCienKmH;
    }

    public void setTiempoCienKmH(double tiempoCienKmH) {
        this.tiempoCienKmH = tiempoCienKmH;
    }

    /**
     * Método toString para representar el vehículo deportivo como una cadena.
     * @return Una cadena que representa al vehículo deportivo con todos sus atributos.
     */
    @Override
    public String toString() {
        return super.toString() + ", Deportivo numeroPasajeros: " + numeroPasajeros + ", numeroPuertas: " + numeroPuertas
                + ", numeroBolsasAire: " + numeroBolsasAire + ", caballosFuerza: " + caballosFuerza + ", tiempoCienKmH: "
                + tiempoCienKmH + "";
    }
}
