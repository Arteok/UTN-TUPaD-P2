package resolucion.tp5.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Gustavo Cerati", "Rock");
        Cancion cancion = new Cancion("Crimen", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}

