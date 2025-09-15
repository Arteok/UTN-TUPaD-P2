package pkg2.registromascotas;

public class Mascota {
    
    // Atributos
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("===== Información de la Mascota =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para simular el paso de un año
    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años.");
    }
}
