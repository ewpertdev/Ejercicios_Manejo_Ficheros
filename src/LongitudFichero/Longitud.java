package LongitudFichero;

import java.io.File;
import java.nio.file.Files;

public class Longitud {
    public static void main(String[] args) {
        // Devolver la longitud del CONTENIDO dentro del archivo "fileLength.txt"

        // Declaramos un String con la variable a la que asignamos "fileLength.txt"
        String theTxtFile = "fileLength.txt";

        // El objeto
        File crearTxt = new File(theTxtFile);

        try {
            if (!crearTxt.exists()) {
                crearTxt.createNewFile();  // Creamos el archivo si no existe
                System.out.println("El archivo se ha creado");

            } else {
                System.out.println("El archivo ya existe");
            }
            System.out.println("La longitud del archivo es: " + Files.size(crearTxt.toPath()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
