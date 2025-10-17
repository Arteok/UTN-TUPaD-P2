package resolucion.tp5.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS ROG", "Z590");
        Propietario dueño = new Propietario("Pablo Mariasch", "12345678");
        Computadora pc = new Computadora("Lenovo", "SN001", placa, dueño);

        System.out.println("Computadora: " + pc.getMarca() + " - " + pc.getNumeroSerie());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo() + " - " + pc.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + pc.getPropietario().getNombre() + " - " + pc.getPropietario().getDni());
    }
}

