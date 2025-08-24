
package pkg5.operaciones.basicas;
import java.util.Scanner;

public class OperacionesBasicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar los dos números
        System.out.print("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();

        // Realizar operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // Para la división, usamos double para obtener decimales
        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2;
        } else {
            System.out.println("¡Error! No se puede dividir entre 0.");
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        }

        entrada.close();
        
    }

}
