package resolucion.tp5.Ejercicio13;

public class GeneradorQR {

    public GeneradorQR() {}

    // Dependencia de creación: crea un objeto CodigoQR dentro del método
    public void generar(String valor, Usuario usuario) {
        System.out.println("Generando código QR...");
        CodigoQR codigo = new CodigoQR(valor, usuario);
        codigo.mostrarInfo();
        System.out.println("Código QR generado exitosamente.\n");
    }
}

