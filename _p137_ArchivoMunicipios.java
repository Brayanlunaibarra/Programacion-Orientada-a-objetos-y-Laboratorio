import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class _p137_ArchivoMunicipios {
    public static void main(String[] args) {
        File arch= new File("Deportes.txt");
        String[] Deportes ={"Futbol","Beisbol","Ciclismo","Acletismo","Natacion","Motociclismo"};
        BufferedReader leer= null;
        try {
            BufferedWriter Escritor = new BufferedWriter(new FileWriter(arch));
            for (String deportes : Deportes) {
                Escritor.write(deportes + "\n");
            }
            Escritor.close();
        } catch (Exception e) {
            System.out.println("hay errores aqui mucho ojo cuate");
        }
        try {
            leer = new BufferedReader(new FileReader("Deportes.txt"));
            String linea = leer.readLine();
            // Mientras haya más líneas, seguir leyendo y mostrando
            while (linea != null) {
                System.out.println(linea);
                linea = leer.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
        try {
            if (leer != null) {
                leer.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
        }
    }
}