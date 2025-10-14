package pkg9.costo.envio;
import java.util.Scanner;

public class CostoEnvio {
    // a. Calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona inválida, se tomará costo 0.");
            return 0.0;
        }
        return peso * costoPorKg;
    }
    // b. Calcular total de la compra (producto + envío)
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio);
        
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}
