package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Esta clase proporciona métodos para realizar validaciones en entradas de datos del usuario.
 * Las validaciones incluyen la verificación de que los valores sean cadenas con formatos específicos, como IDs, nombres, apellidos y números de teléfono.
 */
public class Validaciones {

    /**
     * Valida que una cadena de texto tenga exactamente 10 dígitos.
     * Este método solicita al usuario que ingrese una ID y verifica que la entrada contenga exactamente 10 dígitos numéricos.
     * 
     * @param scanner El objeto Scanner utilizado para leer la entrada del usuario.
     * @param mensaje El mensaje que se mostrará al usuario para solicitar la entrada.
     * @return La ID validada que consiste exactamente en 10 dígitos numéricos.
     */
    public static String validarIdCliente(Scanner scanner, String mensaje) {
        String id;
        while (true) {
            System.out.print(mensaje);
            id = scanner.nextLine().trim();
            if (id.matches("\\d{10}")) { // Verifica que sean 10 dígitos
                return id;
            } else {
                System.out.println("ID inválido. Debe contener exactamente 10 números.");
            }
        }
    }

    /**
     * Valida que un nombre o apellido no esté vacío y comience con una letra mayúscula.
     * Este método solicita al usuario que ingrese un nombre o apellido y asegura que cumpla con los criterios establecidos:
     * debe comenzar con una letra mayúscula y solo contener letras.
     * 
     * @param scanner El objeto Scanner utilizado para leer la entrada del usuario.
     * @param mensaje El mensaje que se mostrará al usuario para solicitar la entrada.
     * @return El nombre o apellido validado que comienza con mayúscula y contiene solo letras.
     */
    public static String validarNombreOApellido(Scanner scanner, String mensaje) {
        String texto;
        while (true) {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim();
            if (texto.matches("[A-ZÁÉÍÓÚÑ][a-záéíóúñ]*")) { // Verifica que comience con mayúscula
                return texto;
            } else {
                System.out.println("Entrada inválida. Debe comenzar con mayúscula y solo contener letras.");
            }
        }
    }

    /**
     * Valida que un número de teléfono tenga exactamente 10 dígitos.
     * Este método solicita al usuario que ingrese un número de teléfono y verifica que tenga 10 dígitos numéricos.
     * 
     * @param scanner El objeto Scanner utilizado para leer la entrada del usuario.
     * @param mensaje El mensaje que se mostrará al usuario para solicitar la entrada.
     * @return El número de teléfono validado que consiste exactamente en 10 dígitos numéricos.
     */
    public static String validarTelefono(Scanner scanner, String mensaje) {
        String telefono;
        while (true) {
            System.out.print(mensaje);
            telefono = scanner.nextLine().trim();
            if (telefono.matches("\\d{10}")) { // Verifica que sean 10 dígitos
                return telefono;
            } else {
                System.out.println("Teléfono inválido. Debe contener exactamente 10 números.");
            }
        }
    }
}
