package resolucion.tp5.Ejercicio8;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composición

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    public void mostrarInfo() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        firmaDigital.mostrarInfo();
    }
}

