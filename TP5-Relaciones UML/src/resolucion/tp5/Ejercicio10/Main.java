package resolucion.tp5.Ejercicio10;

public class Main {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-10-17");
        Titular titular = new Titular("Martha López", "38900123");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 250000.50, clave, titular);

        cuenta.mostrarInfo();
    }
}

