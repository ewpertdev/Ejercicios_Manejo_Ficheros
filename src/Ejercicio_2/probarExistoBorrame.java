package Ejercicio_2;

import java.io.File;

class Existo_Borrame {
    public static void borrarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("borrado");
            } else {
                System.out.println("No se pudo borrar el archivo");
            }
        } else {
            System.out.println("El archivo no existe");
        }
    }
}

public class probarExistoBorrame {
    public static void main(String[] args) {
        Existo_Borrame.borrarArchivo("borradme.txt");
        // Para probar el programa hay que crear un archivo con el nombre "borradme.txt"
        // dentro de la misma carpeta de este proyecto

    }
}
