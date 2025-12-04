package parte.pkg2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== TP 8 - PARTE 2: Excepciones ===");
            System.out.println("1. División segura");
            System.out.println("2. Conversión de cadena a número");
            System.out.println("3. Lectura de archivo (FileNotFoundException)");
            System.out.println("4. Excepción personalizada: EdadInvalidaException");
            System.out.println("5. try-with-resources");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    DivisionSegura.ejecutar();
                    break;
                case 2:
                    ConversionCadenaNumero.ejecutar();
                    break;
                case 3:
                    LeerArchivo.ejecutar();
                    break;
                case 4:
                    PruebaEdad.ejecutar();
                    break;
                case 5:
                    LecturaArchivoTryWithResources.ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();

        } while (opcion != 0);
    }
}

