package resolucion.tp5.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pablo Mariasch", "12345678");
        Mesa mesa1 = new Mesa(5, 4);
        Reserva reserva1 = new Reserva("2025-10-18", "20:00", cliente1, mesa1);

        reserva1.mostrarInfo();
    }
}

