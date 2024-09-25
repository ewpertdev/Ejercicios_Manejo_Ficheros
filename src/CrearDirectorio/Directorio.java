package CrearDirectorio;

import java.io.File;

public class Directorio {
    public static void main(String[] args) {

        // Crear directorio
        File newDir = new File("Pruebas\\carpetaTest\\");

        // Comprobamos si el directorio existe
        if (!newDir.exists()) {
            // Intentamos crear el directorio si no existe
            if (newDir.mkdirs()) {
                System.out.println("Se ha creado un direcctorio ubicado en:" + newDir.getAbsolutePath());
            }
        } else {
            System.out.println("Directorio ya existe");
        }

    }
}
