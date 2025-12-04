package parte.pkg1;

public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numero;
    private String titular;
    private double porcentajeDescuento; // por ejemplo 10% = 0.10

    public TarjetaCredito(String numero, String titular, double porcentajeDescuento) {
        this.numero = numero;
        this.titular = titular;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - porcentajeDescuento);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("\nProcesando pago con Tarjeta de Crédito de " + titular);
        System.out.println("Monto debitado: $" + monto);
    }
}



