
package tp6_ejercicio_3;

public class Main {
    public static void main(String[] args) {
        Universidad univ = new Universidad("Universidad Nacional de Ushuaia");

        //Crear profesores
        Profesor prof1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor prof2 = new Profesor("P002", "Luis Gómez", "Programación");
        Profesor prof3 = new Profesor("P003", "María López", "Estadística");

        //Crear cursos
        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Probabilidad");
        Curso c4 = new Curso("C004", "Base de Datos");
        Curso c5 = new Curso("C005", "Análisis Matemático");

        //Agregar a la universidad
        univ.agregarProfesor(prof1);
        univ.agregarProfesor(prof2);
        univ.agregarProfesor(prof3);

        univ.agregarCurso(c1);
        univ.agregarCurso(c2);
        univ.agregarCurso(c3);
        univ.agregarCurso(c4);
        univ.agregarCurso(c5);

        //Asignar profesores a cursos
        univ.asignarProfesorACurso("C001", "P001");
        univ.asignarProfesorACurso("C002", "P002");
        univ.asignarProfesorACurso("C004", "P002");
        univ.asignarProfesorACurso("C003", "P003");

        //Listar cursos y profesores
        univ.listarProfesores();
        univ.listarCursos();

        //Cambiar profesor de un curso
        System.out.println("\n=== Cambiar profesor del curso C004 ===");
        univ.asignarProfesorACurso("C004", "P003");

        //Eliminar un curso
        System.out.println("\n=== Eliminar curso C001 ===");
        univ.eliminarCurso("C001");

        //Eliminar un profesor
        System.out.println("\n=== Eliminar profesor P002 ===");
        univ.eliminarProfesor("P002");

        //Reporte de cursos por profesor
        univ.reporteCursosPorProfesor();
    }
}

