
package resolucion.tp5.Ejercicio1;

// Clase Main para probar
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Manu Ginóbili", "30123456");
        Pasaporte pasaporte = new Pasaporte("A1234567", "2025-10-16", "foto_manu.jpg", "jpg", titular);

        System.out.println(pasaporte);
        System.out.println("El titular del pasaporte es: " + pasaporte.getTitular().toString());
        System.out.println("El pasaporte del titular es: " + titular.getPasaporte().toString());
    }
}

