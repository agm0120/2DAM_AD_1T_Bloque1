import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio2 {
    public static void main(String[] args) {
        String path = "./Tema 1/Ejemplo2.txt";
        String pathEscritura = "./Tema 1/Ejemplo2w.txt";

        try {
            FileReader lector = new FileReader(path);
            FileWriter escritor = new FileWriter(pathEscritura);
            // Lee el primer caracter del archivo que haya en el
            int data;

            while ((data = lector.read()) != -1) {

                System.out.println((char) data);
                escritor.write((char) data);

            }

            escritor.close();
            lector.close();
            System.out.println("\nLectura Completada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
