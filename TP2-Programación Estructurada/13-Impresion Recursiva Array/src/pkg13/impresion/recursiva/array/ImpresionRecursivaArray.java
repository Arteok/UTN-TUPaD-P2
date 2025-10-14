
package pkg13.impresion.recursiva.array;
import java.util.Scanner;

public class ImpresionRecursivaArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar los precios originales con recursividad
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        // c. Modificar un precio según índice ingresado por el usuario
        System.out.print("\nIngrese el índice del producto que desea modificar (1 a " + precios.length + "): ");
        int indice = sc.nextInt();

        if (indice - 1 >= 0 && indice - 1 < precios.length) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = sc.nextDouble();
            precios[indice - 1] = nuevoPrecio;

            // d. Mostrar los valores modificados con recursividad
            System.out.println("\nPrecios modificados:");
            mostrarPreciosRecursivo(precios, 0);
        } else {
            System.out.println("Índice inválido. No se modificó ningún precio.");
        }

        sc.close();
    }

    // Función recursiva para mostrar precios
    public static void mostrarPreciosRecursivo(double[] array, int i) {
        if (i < array.length) {
            System.out.println("Precio: $" + array[i]);
            mostrarPreciosRecursivo(array, i + 1); 
        }
    }
}

