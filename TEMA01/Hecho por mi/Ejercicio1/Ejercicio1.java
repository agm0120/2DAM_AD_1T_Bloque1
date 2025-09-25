package Ejercicio1;

import java.io.File;
import java.io.RandomAccessFile;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        try {

            File archivo = new File("./Tema 1/Ejercicio 1/archivo_origen.txt");
            
            byte[] buffer = new byte[1024];
            
            RandomAccessFile random = new RandomAccessFile(archivo, "rw");

            if (archivo.exists()) {
                
                

            } else {
                
            }

        } catch (Exception e) {
            // TODO: handle exception   
        }
        

    }
}
