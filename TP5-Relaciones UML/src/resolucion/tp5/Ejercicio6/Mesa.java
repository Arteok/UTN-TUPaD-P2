package resolucion.tp5.Ejercicio6;

public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void mostrarInfo() {
        System.out.println("Mesa: " + numero + ", Capacidad: " + capacidad);
    }
}

