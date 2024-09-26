package Ejercicio_4;

import java.io.File;

// Comprobamos si es un directorio y luego mostramos los ficheros que tiene
public class ListarDirectorio {
    public static void main(String[] args) {
        File directorio = new File("Pruebas\\carpetaTest\\");
        if (directorio.isDirectory()) {
            System.out.println("Es un directorio ubicado en: \n" + directorio.getAbsolutePath());
            for (File fichero : directorio.listFiles()) {
                System.out.println("Este directorio tiene estos fichero/s: \n" + fichero.getName());
            }
        } else {
            System.out.println("No es un directorio");
        }
    }
}

