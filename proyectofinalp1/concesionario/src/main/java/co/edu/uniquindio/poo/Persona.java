package co.edu.uniquindio.poo;

/**
 * Clase que representa a una persona con sus atributos básicos.
 */
public class Persona {
    
    // Atributos de la clase Persona
    private String nombre;  // Nombre de la persona
    private String apellido;  // Apellido de la persona
    private String ID;  // Identificación de la persona (por ejemplo, número de cédula o DNI)
    private String telefono;  // Número de teléfono de la persona

    /**
     * Constructor de la clase Persona que inicializa los atributos.
     * 
     * @param nombre El nombre de la persona
     * @param apellido El apellido de la persona
     * @param ID El identificador único de la persona
     * @param telefono El número de teléfono de la persona
     */
    public Persona(String nombre, String apellido, String ID, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.telefono = telefono;
    }

    /**
     * Muestra la información básica de la persona (nombre).
     * 
     * @return Un string con el nombre de la persona
     */
    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\n";
    }

    // Métodos getter y setter para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Sobreescribe el método toString para mostrar toda la información de la persona.
     * 
     * @return Un string con los detalles completos de la persona
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", telefono=" + telefono + "]";
    }
}
