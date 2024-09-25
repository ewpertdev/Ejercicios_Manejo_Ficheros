package Ejercicio_3;

import java.io.File;
import java.util.Scanner;
class Fichero {
    void crearFichero(String nombreFichero) {
        File miFichero = new File(nombreFichero);
        try {
            if (miFichero.createNewFile()) {
                System.out.println("Has creado el fichero: " + nombreFichero);
            } else {
                System.out.println("El fichero ya existe.");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Directorio{
    void crearDirectorio(String nombreDirectorio) {
        File miDirectorio = new File(nombreDirectorio);
        try {
            if (miDirectorio.mkdirs()) {
                System.out.println("Has creado el directorio: " + nombreDirectorio);
            } else {
                System.out.println("El directorio ya existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class probarFicheroDirectorio {
    public static void main(String[] args) {

        // Crea un programa que cree un fichero dentro de un directorio ambos nombres son introducidos por el usuario.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del directorio: ");
        String nombreDirectorio = scanner.nextLine();

        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = scanner.nextLine();

        Directorio dirObjeto = new Directorio();
        dirObjeto.crearDirectorio(nombreDirectorio);

        Fichero ficheroObjeto = new Fichero();
        ficheroObjeto.crearFichero(nombreDirectorio + File.separator + nombreFichero);

        scanner.close();



    }
}
