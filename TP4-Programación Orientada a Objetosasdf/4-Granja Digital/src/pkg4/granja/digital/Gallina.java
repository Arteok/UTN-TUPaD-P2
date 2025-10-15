package pkg4.granja.digital;

public class Gallina {
    // Atributos privados
    private int idGallina;
    private int edad;          
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; 
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total de huevos: " + huevosPuestos);
    }

    // Método para envejecer un año
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Edad actual: " + edad);
    }

    // Método para mostrar estado actual
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " → Edad: " + edad + " años, Huevos puestos: " + huevosPuestos);
    }
}



