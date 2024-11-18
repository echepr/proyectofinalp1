package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Cliente extends Persona {
        private List<Vehiculo> vehiculos = new LinkedList<>();

    
    
        public Cliente(String nombre, String apellido, String ID, String telefono) {
            super(nombre, apellido, ID, telefono);
        }

        public void agregarVehiculo(Vehiculo vehiculo) {
            vehiculos.add(vehiculo);
        }
        
        public Vehiculo buscarVehiculoPorMarca(String marca) {
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
                    return vehiculo;
                }
            }
            return null;
        }
        
        public void removerVehiculo(Vehiculo vehiculo) {
            vehiculos.remove(vehiculo);
        }
        
        public List<Vehiculo> getVehiculos() {
            return vehiculos;
        }
        
    
        public void solicitarAlquiler(Vehiculo vehiculo, int duracionDias) {
        
            System.out.println("Solicitando alquiler del vehículo: " + vehiculo +  " por " + duracionDias + " días.");
        }
    
    
        public void solicitarCompra(Vehiculo vehiculo) {
            System.out.println("Solicitando compra del vehículo: " + vehiculo);
        }
 
        @Override
        public String toString() {
            return "Cliente getNombre():" + getNombre() + ", getApellido():" + getApellido() + ", getID():" + getID()
                    + ", getTelefono():" + getTelefono() + "";
        }
}
    
    

