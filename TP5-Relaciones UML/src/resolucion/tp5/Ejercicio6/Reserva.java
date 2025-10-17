package resolucion.tp5.Ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // asociación unidireccional
    private Mesa mesa;       // agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void mostrarInfo() {
        System.out.println("Reserva: " + fecha + " a las " + hora);
        cliente.mostrarInfo();
        mesa.mostrarInfo();
    }
}

