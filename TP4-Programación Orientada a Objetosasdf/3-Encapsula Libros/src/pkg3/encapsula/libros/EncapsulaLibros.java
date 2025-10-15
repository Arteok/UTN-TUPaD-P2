
package pkg3.encapsula.libros;

public class EncapsulaLibros {

    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("Amor en los tiempos del cólera", "Gabriel García Márquez", 1985);

        // Mostrar información inicial
        System.out.println("Información inicial del libro:");
        libro1.mostrarInfo();

        // Intentar modificar con un año inválido
        System.out.println("\nIntentando cambiar el año a -2025:");
        libro1.setAñoPublicacion(-2025); 

        // Intentar modificar con un año válido
        System.out.println("\nCambiando el año a 2025:");
        libro1.setAñoPublicacion(2025); 

        // Mostrar información final
        System.out.println("\nInformación final del libro:");
        libro1.mostrarInfo();
    }
}
