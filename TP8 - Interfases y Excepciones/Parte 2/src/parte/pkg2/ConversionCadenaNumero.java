package parte.pkg2;

import java.util.Scanner;

public class ConversionCadenaNumero {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número en texto: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido correctamente: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto no es un número válido.");
        }
    }
}



