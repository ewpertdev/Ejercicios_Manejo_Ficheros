package Ejercicio_3;

import java.io.File;
import java.util.Scanner;
class Fichero {
    void crearFichero(String nombreFichero) {
        File file = new File(nombreFichero);
        try {
            if (!file.createNewFile()) {
                System.out.println("El fichero ya existe.");
            } else {
                System.out.println("Has creado el fichero: " + nombreFichero);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Directorio{
    void crearDirectorio(String nombreDirectorio) {
        File file = new File(nombreDirectorio);
        try {
            if (!file.mkdirs()) {
                System.out.println("El directorio ya existe.");
            } else {
                System.out.println("Has creado el directorio: " + nombreDirectorio);
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

        Directorio directorio = new Directorio();
        directorio.crearDirectorio(nombreDirectorio);

        Fichero fichero = new Fichero();
        fichero.crearFichero(nombreDirectorio + File.separator + nombreFichero);

        scanner.close();



    }
}
