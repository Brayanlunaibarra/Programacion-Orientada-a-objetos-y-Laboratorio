import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class _p138_ArchivoMaterias {
    public static void main(String[] args) {
        File arch= new File("Materias.txt");
        BufferedReader leer= null;
        Scanner obj = new Scanner(System.in);
        System.out.println("cuantos elementos quieres añadir");
        int elementos= obj.nextInt();
        String[] Materias = new String[elementos];

        for (int i = 0; i < elementos; i++) {
            System.out.print("Dame la materia #" + (i + 1) + ": ");
            String nombredeMaterias=obj.next();
            Materias[i] = nombredeMaterias;
        }
        try {
            BufferedWriter Escritor = new BufferedWriter(new FileWriter(arch));
            for (String deportes : Materias) {
                Escritor.write(deportes + "\n");
            }
            Escritor.close();
        } catch (Exception e) {
            System.out.println("hay errores aqui mucho ojo cuate");
        }
        try {
            leer = new BufferedReader(new FileReader("Materias.txt"));
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
