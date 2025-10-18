package resolucion.tp5.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pablo Mariasch", "pablo@example.com");
        FirmaDigital firma = new FirmaDigital("ABC123HASH", "2025-10-17", usuario);
        Documento doc = new Documento("Contrato de Alquiler", "Contenido del contrato...", firma);

        doc.mostrarInfo();
    }
}

