import java.io.RandomAccessFile;

public class CasoPractico1Corregido {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("./Tema 1/datos.txt", "rw");
            file.seek(4);
            int unByte = file.read();
            System.out.println((char)unByte);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
