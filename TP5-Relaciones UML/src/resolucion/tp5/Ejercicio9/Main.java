package resolucion.tp5.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Yohana Martins", "PAMI");
        Profesional profesional = new Profesional("Dr. Kitty", "Otorrinolaringología");
        CitaMedica cita = new CitaMedica("2025-10-18", "10:30", paciente, profesional);

        cita.mostrarInfo();
    }
}

