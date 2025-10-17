package resolucion.tp5.Ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarInfo() {
        System.out.println("Tarjeta N°: " + numero + " - Vence: " + fechaVencimiento);
        System.out.println("Banco: " + banco.getNombre() + " (CUIT: " + banco.getCuit() + ")");
        System.out.println("Cliente: " + cliente.getNombre() + " - DNI: " + cliente.getDni());
    }
}
