
package resolucion.tp5.Ejercicio1;

// Clase Pasaporte - Composición con Foto, Asociación con Titular
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición
    private Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto); // Composición: se crea dentro del pasaporte
        this.titular = titular;
        titular.setPasaporte(this); // Mantiene la bidireccionalidad
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision +
                ", foto=" + foto + ", titular=" + titular + "]";
    }
}

