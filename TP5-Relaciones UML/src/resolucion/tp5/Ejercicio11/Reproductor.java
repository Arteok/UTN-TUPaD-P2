package resolucion.tp5.Ejercicio11;

public class Reproductor {

    public Reproductor() {}

    // Dependencia de uso: utiliza una Cancion como parámetro
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo...");
        cancion.mostrarInfo();
    }
}

