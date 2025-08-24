
package pkg8.division.comparativa;
import java.util.Scanner;

public class DivisionComparativa {

      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar números al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = entrada.nextInt();

        if (num2 != 0) {
            // División entera
            int resultadoInt = num1 / num2;

            // División decimal usando casting a double
            double resultadoDouble = (double) num1 / num2;

            // Mostrar resultados
            System.out.println("\nResultados:");
            System.out.println("División entera (int): " + resultadoInt);
            System.out.println("División decimal (double): " + resultadoDouble);
        } else {
            System.out.println("¡Error! No se puede dividir entre 0.");
        }
        entrada.close();
    }
}
