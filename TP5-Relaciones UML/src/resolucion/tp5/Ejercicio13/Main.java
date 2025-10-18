package resolucion.tp5.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Torres", "ana.torres@email.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR-987654321", usuario);
    }
}

