// Crea un programa que dado un fichero (hay que comprobar que existe
//primero) compruebe los permisos que tiene y los muestre de la siguiente
//manera rwx o _wx (como el Linux). Si tiene todos los permisos tiene que dar la
//opción al usuario de cambiarlos tecleando r,w,x (las demás opciones dan
//error)

package Ejercicio_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PermisosFichero {
    public static void main(String[] args) {
        // Crear un fichero
        File suspenso;
        suspenso = new File("Pruebas\\carpetaTest\\hola.txt");

        // Comprobar si el fichero existe
        try {
            if (!suspenso.exists()) {
                System.out.println("El fichero no existe");
                if (suspenso.createNewFile()) {
                    System.out.println("Vamos a crear el fichero " + suspenso.getName() + " en " + suspenso.getAbsolutePath());
                }
                } else {
                System.out.println("El fichero "+ suspenso.getName() + " existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Comprobar los permisos del fichero
        Scanner escribe = new Scanner(System.in);

        if (suspenso.canRead() && suspenso.canWrite() && suspenso.canExecute()) {
            System.out.println("Los permisos del fichero son: rwx, te gustaria cambiar los permisos? S/N");
            String cambiar = escribe.nextLine();

            if (cambiar.equalsIgnoreCase("s")) {
                System.out.println("Introduce los nuevos permisos: ");
                String cambiarLectura = escribe.next();
                String cambiarEscritura = escribe.next();
                String cambiarExe = escribe.next();
                } else {
                    System.out.println("Gracias por usar mi programa");
                }
        } else {
            System.out.println("No tiene ningún permiso");
        }

        }
    }

