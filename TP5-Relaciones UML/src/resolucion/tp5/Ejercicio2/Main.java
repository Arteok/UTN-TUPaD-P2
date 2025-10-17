
package resolucion.tp5.Ejercicio2;


public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("María López", "39876543");
        Bateria bateria = new Bateria("Samsung-EB1234", 4500);
        Celular celular = new Celular("IMEI00123456789", "Samsung", "Galaxy S22", bateria, usuario);

        System.out.println("Celular: " + celular.getMarca() + " " + celular.getModelo() + " (IMEI: " + celular.getImei() + ")");
        /*System.out.println("Usuario: " + usuario.getNombre() + " - DNI: " + usuario.getDni());*/
        System.out.println(usuario.toString());
        System.out.println("Batería: " + bateria.getModelo() + " (" + bateria.getCapacidad() + ")");

    }

}
