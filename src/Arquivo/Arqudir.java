package Arquivo;

import java.io.File;
import java.io.IOException;


/**
 * ** @author oracle
 */
public class Arqudir {

    public static void main(String[] args) throws IOException {

        File directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        if (directorio.exists()){
            System.out.println("ya existe");
        }else{
            System.out.println("Creando directorio...");
            System.out.println(directorio.mkdirs());
                }

        File fichero = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if(fichero.exists()){
            System.out.println("ya existe");
        }else{
        System.out.println("Creando fichero..");
        System.out.println(fichero.createNewFile());
    }
        File directorio2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");

        if (directorio2.exists()){
            System.out.println("ya existe");
        }else{
            System.out.println("Creando directorio...");
            System.out.println(directorio2.mkdirs());
                }

        File fichero2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
        if(fichero2.exists()){
            System.out.println("ya existe");
        }else{
        System.out.println("Creando fichero..");
        System.out.println(fichero2.createNewFile());
    }
        System.out.println("Ap.5\n Nombres sin rutas: ");
        System.out.println("Fichero: "+fichero.getName());
        System.out.println("Directorio: "+directorio2.getName());
        System.out.println("Ap.6\n Ruta 1 Directorio: "+directorio.getAbsolutePath());
        
        System.out.println("Ap.7\n Fichero: "+fichero.getName());
        System.out.println("Ruta: "+fichero.getAbsolutePath());
        System.out.println("Fichero "+fichero.canRead());
        System.out.println("Fichero "+fichero.canWrite());
        System.out.println("Tamaño: "+fichero.length());
        System.out.println("Fichero solo lectura? "+fichero.setReadOnly());
        System.out.println("Fichero escritura? "+fichero.setWritable(true));
        System.out.println("");  
        System.out.println("Fichero eliminado? "+fichero.delete());
        System.out.println("Fichero eliminado? "+fichero2.delete());
        System.out.println("Fichero eliminado? "+directorio2.delete());
        System.out.println("Fichero eliminado? "+directorio.delete());
        System.out.println("");
 

 
        
 
    }
}
