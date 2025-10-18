package resolucion.tp5.Ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular;               // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
        this.titular = titular;
        titular.setCuenta(this); // Establece la relación bidireccional
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void mostrarInfo() {
        System.out.println("Cuenta Bancaria - CBU: " + cbu + " | Saldo: $" + saldo);
        claveSeguridad.mostrarInfo();
        if (titular != null) {
            titular.mostrarInfo();
        }
    }
}

