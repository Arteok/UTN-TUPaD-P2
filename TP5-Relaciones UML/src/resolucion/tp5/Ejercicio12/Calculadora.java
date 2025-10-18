package resolucion.tp5.Ejercicio12;

public class Calculadora {

    public Calculadora() {}

    // Dependencia de uso: utiliza un objeto Impuesto pero no lo guarda como atributo
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto...");
        impuesto.mostrarInfo();
        double total = impuesto.getMonto() * 1.21;
        System.out.println("Total con IVA: $" + total);
    }
}

