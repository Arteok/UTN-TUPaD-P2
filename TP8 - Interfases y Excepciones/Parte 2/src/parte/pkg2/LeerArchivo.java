package parte.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {

    public static void ejecutar() {

        File archivo = new File("texto.txt");

        try {
            Scanner sc = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo 'texto.txt' no existe.");
        }
    }
}



