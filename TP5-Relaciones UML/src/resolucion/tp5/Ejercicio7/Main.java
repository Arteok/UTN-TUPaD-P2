package resolucion.tp5.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("V12 Turbo", "BTM001");
        Conductor conductor1 = new Conductor("Bruce Wayne", "BAT1234");
        Vehiculo vehiculo1 = new Vehiculo("GOTH-001", "Batimóvil", motor1, conductor1);

        vehiculo1.mostrarInfo();
    }
}

