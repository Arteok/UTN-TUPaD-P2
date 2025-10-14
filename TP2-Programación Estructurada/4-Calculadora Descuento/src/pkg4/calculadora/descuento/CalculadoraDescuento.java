
package pkg4.calculadora.descuento;
import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese la categor\u00EDa del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuento = 0;

        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categor\u00EDa inv\u00E1lida. No se aplica descuento.");
                System.out.println("Precio final: " + precioOriginal);
                scanner.close();
                return;
        }

        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}

