package co.edu.uniquindio.poo;

import java.util.ArrayList;

/**
 * La clase Administrador extiende la clase Persona y representa a un administrador del sistema. 
 * Los administradores tienen la capacidad de gestionar empleados, generar reportes, controlar el acceso y realizar la recuperación de contraseñas.
 */
public class Administrador extends Persona {

    // Atributos específicos de la clase Administrador
    private String contraseña;
    private String preguntaSeguridad; // Atributo para la pregunta de seguridad
    private String respuestaSeguridad; // Atributo para la respuesta de seguridad
    private ArrayList<Empleado> empleados; // Lista de empleados gestionados por el administrador
    private boolean bloqueado; // Indica si la cuenta del administrador está bloqueada

    /**
     * Constructor de la clase Administrador.
     * @param nombre Nombre del administrador.
     * @param apellido Apellido del administrador.
     * @param ID Identificación del administrador.
     * @param telefono Teléfono del administrador.
     * @param contraseña Contraseña del administrador.
     * @param preguntaSeguridad Pregunta de seguridad para la recuperación de contraseña.
     * @param respuestaSeguridad Respuesta de seguridad para la recuperación de contraseña.
     */
    public Administrador(String nombre, String apellido, String ID, String telefono, String contraseña,
                         String preguntaSeguridad, String respuestaSeguridad) {
        super(nombre, apellido, ID, telefono); // Llamada al constructor de la clase Persona
        this.contraseña = contraseña;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.empleados = new ArrayList<>();
        this.bloqueado = false; // Por defecto, la cuenta no está bloqueada
    }

    /**
     * Método para gestionar empleados (agregar un nuevo empleado).
     * @param nuevoEmpleado Empleado a agregar a la lista de empleados.
     */
    public void gestionarEmpleados(Empleado nuevoEmpleado) {
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado: " + nuevoEmpleado.getNombre());
    }

    /**
     * Obtiene la lista de empleados gestionados por el administrador.
     * @return Lista de empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Método para buscar un empleado por su ID.
     * @param id ID del empleado a buscar.
     * @return El empleado encontrado o null si no se encuentra.
     */
    public Empleado buscarEmpleadoPorId(String id) {
        for (Empleado empleado : empleados) {
            if (empleado.getID().equals(id)) {
                return empleado;  // Retorna el empleado encontrado
            }
        }
        return null;  // Retorna null si no se encuentra el empleado
    }

    /**
     * Método para actualizar la información de un empleado.
     * @param ID ID del empleado a actualizar.
     * @param nuevoNombre Nuevo nombre del empleado.
     * @param nuevoApellido Nuevo apellido del empleado.
     * @param nuevoTelefono Nuevo teléfono del empleado.
     * @param nuevaContraseña Nueva contraseña del empleado.
     */
    public void actualizarEmpleado(String ID, String nuevoNombre, String nuevoApellido, String nuevoTelefono, String nuevaContraseña) {
        for (Empleado empleado : empleados) {
            if (empleado.getID().equals(ID)) {
                empleado.setNombre(nuevoNombre);
                empleado.setApellido(nuevoApellido);
                empleado.setTelefono(nuevoTelefono);
                empleado.setContraseña(nuevaContraseña);
                System.out.println("Empleado actualizado: " + empleado.getNombre());
                return;
            }
        }
        System.out.println("Empleado no encontrado con ID: " + ID);
    }

    /**
     * Método para eliminar un empleado de la lista.
     * @param ID ID del empleado a eliminar.
     */
    public void eliminarEmpleado(String ID) {
        boolean encontrado = empleados.removeIf(empleado -> empleado.getID().equals(ID));
        if (encontrado) {
            System.out.println("Empleado eliminado con ID: " + ID);
        } else {
            System.out.println("Empleado no encontrado con ID: " + ID);
        }
    }

    /**
     * Método para bloquear la cuenta de un empleado.
     * @param ID ID del empleado cuya cuenta será bloqueada.
     */
    public void bloquearCuenta(String ID) {
        for (Empleado empleado : empleados) {
            if (empleado.getID().equals(ID)) {
                empleado.setBloqueado(true);
                System.out.println("Cuenta bloqueada para: " + empleado.getNombre());
                return;
            }
        }
        System.out.println("Empleado no encontrado con ID: " + ID);
    }

    /**
     * Método para desbloquear la cuenta de un empleado.
     * @param ID ID del empleado cuya cuenta será desbloqueada.
     */
    public void desbloquearCuenta(String ID) {
        for (Empleado empleado : empleados) {
            if (empleado.getID().equals(ID)) {
                empleado.setBloqueado(false);
                System.out.println("Cuenta desbloqueada para: " + empleado.getNombre());
                return;
            }
        }
        System.out.println("Empleado no encontrado con ID: " + ID);
    }

    /**
     * Método para iniciar sesión del administrador.
     * @param ID ID del administrador.
     * @param contraseña Contraseña del administrador.
     * @return true si el inicio de sesión es exitoso, false si las credenciales son incorrectas o la cuenta está bloqueada.
     */
    public boolean iniciarSesion(String ID, String contraseña) {
        if (getID().equals(ID) && this.contraseña.equals(contraseña) && !bloqueado) {
            System.out.println("Inicio de sesión exitoso para: " + getNombre());
            return true;
        } else {
            System.out.println("Credenciales inválidas o cuenta bloqueada.");
            return false;
        }
    }

    /**
     * Método para cambiar la contraseña del administrador.
     * @param nuevaContraseña Nueva contraseña que se desea establecer.
     */
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
        System.out.println("Contraseña cambiada exitosamente.");
    }

    /**
     * Método para recuperar la contraseña del administrador.
     * @param respuesta Respuesta a la pregunta de seguridad.
     * @param nuevaContraseña Nueva contraseña para el administrador.
     * @return true si la respuesta es correcta y la contraseña se ha actualizado, false si la respuesta es incorrecta.
     */
    public boolean recuperarContraseña(String respuesta, String nuevaContraseña) {
        if (respuestaSeguridad.equalsIgnoreCase(respuesta)) {
            setContraseña(nuevaContraseña);
            System.out.println("Contraseña actualizada correctamente.");
            return true;
        } else {
            System.out.println("Respuesta incorrecta.");
            return false;
        }
    }

    // Métodos para acceder y modificar atributos

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    /**
     * Muestra la información del administrador, incluyendo el nombre y la contraseña (ocultada por seguridad).
     * @return Información del administrador.
     */
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Contraseña: " + (contraseña.replaceAll(".", "*"));
    }
}
