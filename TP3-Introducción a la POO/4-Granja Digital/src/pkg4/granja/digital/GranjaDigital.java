package pkg4.granja.digital;

public class GranjaDigital {

    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);

        // Simular acciones
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();

        // Mostrar estado final
        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
