package parte.pkg2;

import java.util.Scanner;

public class PruebaEdad {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            validarEdad(edad);

            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }
}



