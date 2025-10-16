
package resolucion.tp5.Ejercicio1;

// Clase Titular - Asociación bidireccional con Pasaporte
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

