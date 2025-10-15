package pkg2.registromascotas;

public class RegistroMascotas {
 
    public static void main(String[] args) {
        // Crear una mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);

        // Mostrar información
        mascota1.mostrarInfo();

        // Simular paso del tiempo
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();

        // Mostrar información final
        mascota1.mostrarInfo();
    }
}
