package BorrarFichero;

import java.io.File;
import java.io.IOException;

public class BorrarFichero {
    public static void main(String[] args) {
        // Borrar un archivo

        // En una sola linea: File miArchivo = new File("borradme_porfavor.txt");
        String nombreArchivo = "borradme_porfavor.txt";
        File miArchivo = new File(nombreArchivo);

        try {
            if(!miArchivo.exists()){
                miArchivo.createNewFile();
                System.out.println("Archivo "+ miArchivo.getName() +" creado.");

            } else {
                System.out.println("El archivo " + miArchivo.getName() + " ya existe.");
            }
            System.out.println("El archivo " + miArchivo.getName() + " ha sido borrado");
            miArchivo.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
