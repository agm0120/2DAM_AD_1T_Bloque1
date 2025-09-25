import java.io.File;

public class Ejemplo1 {

    public static void main(String[] args) {

        try {
            // Nombre de donde esta el fichero o archivo
            File fichero = new File(".\\Ejemplo1.txt");
            fichero.createNewFile();
            
            String nombreCarpeta = "Backup";
            
            File carpeta = new File(".\\", nombreCarpeta);
            carpeta.mkdirs();
            
            //Nombre de donde queremos guardarlo
            File fichero2 = new File(".\\Backup\\backupEjercicio1.txt");
            fichero.renameTo(fichero2);

            fichero.delete();
            String nombrePrueba = System.console().readLine("Introduce el nombre de la carpeta: ");
            File carpetaPrueba = new File(".\\" , nombrePrueba);
            
            if (carpetaPrueba.exists()) {
                System.out.println("La carpeta (" + carpetaPrueba.getName() + ") ya existe.");
            } else {
                carpetaPrueba.mkdirs();
                System.out.println("La carpeta" + carpetaPrueba.getName() + " se ha creado");
                System.out.println("Ruta relativa: " + carpetaPrueba.getPath());
                System.out.println("Ruta absoluta: " + carpetaPrueba.getAbsolutePath());
            }

        } catch (Exception e) {
            
        }
        
    }
}