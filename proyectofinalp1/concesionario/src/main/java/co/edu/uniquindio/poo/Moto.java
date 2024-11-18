package co.edu.uniquindio.poo;

/**
 * Clase que representa una moto, que es un tipo de vehículo. Hereda de la clase Vehiculo 
 * e implementa la interfaz IVehiculo.
 */
public class Moto extends Vehiculo {

    /**
     * Constructor de la clase Moto, que inicializa los atributos heredados de la clase Vehiculo.
     * 
     * @param marca El nombre de la marca de la moto
     * @param modelo El modelo de la moto
     * @param nuevo Indica si la moto es nueva
     * @param tipoCombustible El tipo de combustible que utiliza la moto (por ejemplo, gasolina, eléctrico)
     * @param tipoTransmision El tipo de transmisión de la moto (manual o automática)
     * @param velocidadMaxima La velocidad máxima que puede alcanzar la moto
     * @param cilindrada La cilindrada del motor de la moto
     * @param revisionTecnica Indica si la moto tiene la revisión técnica vigente
     */
    public Moto(String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, int velocidadMaxima, int cilindrada, boolean revisionTecnica) {
        super(marca, modelo, tipoCombustible, tipoTransmision, nuevo, velocidadMaxima, cilindrada, revisionTecnica);
    }

    /**
     * Método que verifica si la moto es apta según ciertos criterios. 
     * En este caso, se considera apta si tiene una velocidad máxima superior a 100 km/h 
     * y si es nueva.
     * 
     * @return true si la moto es apta, false en caso contrario
     */
    @Override
    public boolean esVehiculoApto() {
        return getVelocidadMaxima() > 100 && isNuevo();
    }
}
