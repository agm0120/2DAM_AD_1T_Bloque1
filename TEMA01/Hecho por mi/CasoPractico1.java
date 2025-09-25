import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.FileReader;

public class CasoPractico1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        try {

            RandomAccessFile file = new RandomAccessFile("./Tema 1/datos.txt", "rw");

            System.out.println("Posicion que desea cambiar? ");
            int posicion = Integer.parseInt(sc.nextLine());

            String nuevo = System.console().readLine("Que letra quiere meter? (solo una)");

            file.seek(posicion);
            
            int data = file.read();
            file.writeBytes(nuevo);

            file.close();
            
        } catch (Exception e) {
            e.fillInStackTrace();
        }

    }
}
