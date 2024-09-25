package AAAA;

import java.io.File;
import java.util.Scanner;

public class ListerContenidoDirectorio {
    public static void main(String[] args){

        Scanner m = new Scanner(System.in);
        File dir;

        while(true){
            System.out.println("Teclea el nombre del directorio: ");
            String nombreDirectorio = m.nextLine();

            dir = new File(nombreDirectorio);

            try {
                if(dir.exists() && dir.isDirectory()){
                    System.out.println("El directorio contiene los siguientes archivos:");
                    File[] files = dir.listFiles();
                    for(File file : files) {
                        System.out.println(file.getName());
                    }
                    break;
                    } else {
                    System.out.println("No existe un directorio con ese nombre, vuelva a intentarlo");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m.close();

        }
    }
}


