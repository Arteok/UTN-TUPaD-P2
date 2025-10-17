package resolucion.tp5.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-50012345-9");
        Cliente cliente = new Cliente("Juan Pérez", "40123456");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", banco);
        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);

        tarjeta.mostrarInfo();
    }
}
