package resolucion.tp5.Ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " (ISBN: " + isbn + ")");
        System.out.println("Autor: " + autor.getNombre() + " - " + autor.getNacionalidad());
        System.out.println("Editorial: " + editorial.getNombre() + " - " + editorial.getDireccion());
    }
}
