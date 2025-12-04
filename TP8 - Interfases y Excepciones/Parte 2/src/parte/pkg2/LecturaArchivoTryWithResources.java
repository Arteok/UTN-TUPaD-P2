package parte.pkg2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivoTryWithResources {

    public static void ejecutar() {

        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {

            String linea;
            System.out.println("Contenido del archivo (try-with-resources):");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

