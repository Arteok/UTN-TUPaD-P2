
package tp6_ejercicio_3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor != null && this.profesor != p) {
            // quitar este curso del profesor anterior
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " - " + nombre +
                (profesor != null ? " | Profesor: " + profesor.getNombre() : " | Sin profesor asignado"));
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}

