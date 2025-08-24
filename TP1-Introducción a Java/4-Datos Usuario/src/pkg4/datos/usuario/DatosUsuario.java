
package pkg4.datos.usuario;
import java.util.Scanner; 

public class DatosUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner 
        Scanner entrada = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

        // Solicitar edad
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        // Cerrar el Scanner
        entrada.close();
    }

}
