
package pkg1.registro.estudiantes;

public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("===== Información del Estudiante =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para subir calificación
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("La calificación aumentó en " + puntos + " puntos. Nueva calificación: " + calificacion);
    }

    // Método para bajar calificación
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        if (this.calificacion < 0) {
            this.calificacion = 0; // No permitimos calificación negativa
        }
        System.out.println("La calificación disminuyó en " + puntos + " puntos. Nueva calificación: " + calificacion);
    }
}

