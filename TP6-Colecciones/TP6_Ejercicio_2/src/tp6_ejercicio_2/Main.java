
package tp6_ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        //Crear autores
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Gabriel García Márquez", "Colombia");
        Autor a3 = new Autor("A003", "Jane Austen", "Reino Unido");

        //Agregar libros
        biblioteca.agregarLibro("L001", "Ficciones", 1944, a1);
        biblioteca.agregarLibro("L002", "Cien años de soledad", 1967, a2);
        biblioteca.agregarLibro("L003", "Orgullo y prejuicio", 1813, a3);
        biblioteca.agregarLibro("L004", "El Aleph", 1949, a1);
        biblioteca.agregarLibro("L005", "El amor en los tiempos del cólera", 1985, a2);

        //Listar todos los libros
        System.out.println("\n=== Listado de libros ===");
        biblioteca.listarLibros();

        //Buscar libro por ISBN
        System.out.println("\n=== Buscar libro L003 ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        //Filtrar libros por año
        System.out.println("\n=== Libros del año 1949 ===");
        biblioteca.filtrarLibrosPorAnio(1949);

        //Eliminar libro
        System.out.println("\n=== Eliminar libro L002 ===");
        biblioteca.eliminarLibro("L002");

        //Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        //Mostrar autores disponibles
        System.out.println("\n=== Autores disponibles ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}

