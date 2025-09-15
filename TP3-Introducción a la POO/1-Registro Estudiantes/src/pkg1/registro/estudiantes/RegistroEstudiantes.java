
package pkg1.registro.estudiantes;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        // Instanciar un estudiante
        Estudiante estudiante1 = new Estudiante("Pablo", "Mariasch", "Programación II", 7.5);
       
        estudiante1.mostrarInfo();

        // Subir calificación
        estudiante1.subirCalificacion(1.5);

        // Bajar calificación
        estudiante1.bajarCalificacion(3.0);
   
        estudiante1.mostrarInfo();
    }
}

