package resolucion.tp5.Ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void mostrarInfo() {
        System.out.println("Código QR: " + valor);
        usuario.mostrarInfo();
    }
}



