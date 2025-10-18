package resolucion.tp5.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Lucía Fernández", "27-35899876-3");
        Impuesto impuesto = new Impuesto(10000, contribuyente);
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto);
    }
}

