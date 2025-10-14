
package pkg1.año.bisiesto;
import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        // Verificación de año bisiesto
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        if (esBisiesto) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

        scanner.close();
    }      
}
