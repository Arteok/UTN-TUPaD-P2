package pkg5.simulacion.nave;

public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= MAX_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }
    // Método para despegar
    public void despegar() {
        if (combustible >= 10) { 
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }
    // Método para avanzar cierta distancia
    public void avanzar(int distancia) {
        int consumo = distancia; // 1 unidad de combustible por unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }
    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
        } else {
            combustible += cantidad;
        }
        System.out.println(nombre + " recargó combustible. Combustible actual: " + combustible);
    }
    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}

