package CrearFichero;

import java.io.File;
import java.io.IOException;

public class Fichero {
    public static void main(String[] args) {

        // Crear fichero

        String archivoTxt = "prueba.txt";
        File miArchivo = new File(archivoTxt);

        try {
            if (miArchivo.createNewFile()) {
                System.out.println("El archivo " + miArchivo.getName() + " ha sido creado");
            } else {
                System.out.println("El archivo ya existe" + "( " + miArchivo.getName() + ")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
