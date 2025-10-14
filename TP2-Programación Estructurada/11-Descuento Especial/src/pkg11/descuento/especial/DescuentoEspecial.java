
package pkg11.descuento.especial;
import java.util.Scanner;

public class DescuentoEspecial {

    // Variable global (estática)
    static double DESCUENTO_ESPECIAL = 0.10;

    // Método para calcular descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        
        calcularDescuentoEspecial(precio);

        sc.close();
    }
}

