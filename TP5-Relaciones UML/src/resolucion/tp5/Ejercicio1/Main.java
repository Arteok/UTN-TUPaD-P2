
package resolucion.tp5.Ejercicio1;

public class Main {
    public static void main(String[] args) {   
        
        Titular titular = new Titular("Manu Ginóbili", "30123456");
        Pasaporte pasaporte = new Pasaporte("A1234567", "2025-10-16", "foto_manu.jpg", "jpg");        
        titular.setPasaporte(pasaporte);
        
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
            
    }
}

