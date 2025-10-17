
package resolucion.tp5.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires");
        Libro libro = new Libro("El amor en los tiempos del cólera", "978-84-376-0494-7", autor, editorial);

        libro.mostrarInfo();
    }

}
