
package pkg12.modificacion.array.precios;
import java.util.Scanner;

public class ModificacionArrayPrecios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar los valores originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        // c. Pedir al usuario qué índice quiere cambiar
        System.out.print("\nIngrese el índice del producto que desea modificar (1 a " + (precios.length) + "): ");
        int indice = sc.nextInt();

        if (indice-1 >= 0 && indice-1 < precios.length) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = sc.nextDouble();

            // modificar el precio
            precios[indice-1] = nuevoPrecio;

            // d. Mostrar los valores modificados
            System.out.println("\nPrecios modificados:");
            mostrarPrecios(precios);
        } else {
            System.out.println("Índice inválido. No se modificó ningún precio.");
        }

        sc.close();
    }

    // Método para recorrer e imprimir un array de precios
    public static void mostrarPrecios(double[] array) {
        for (double precio : array) {
            System.out.println("Precio: $" + precio);
        }
    }
}


