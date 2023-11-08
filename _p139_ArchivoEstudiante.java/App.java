package _p139_ArchivoEstudiante.java;

// Clase App.java
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<>();

        System.out.print("¿Cuántos estudiantes desea ingresar? ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Consumir la nueva línea

            Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
            estudiantes.add(estudiante);
        }

        // Escribir la lista de estudiantes en un archivo de texto
        escribirEstudiantesEnArchivo(estudiantes, "estudiantes.txt");

        // Leer los datos del archivo y cargarlos en otro arreglo de tipo Estudiante
        List<Estudiante> estudiantesDesdeArchivo = leerEstudiantesDesdeArchivo("estudiantes.txt");

        // Mostrar los estudiantes
        System.out.println("Lista de estudiantes:");
        for (Estudiante estudiante : estudiantesDesdeArchivo) {
            System.out.println(estudiante);
        }

        // Calcular y mostrar el promedio de calificaciones de todos los estudiantes
        double promedioCalificaciones = calcularPromedioCalificaciones(estudiantesDesdeArchivo);
        System.out.println("Promedio de calificaciones: " + promedioCalificaciones);

        // Calcular y mostrar el promedio de las edades de todos los estudiantes
        double promedioEdades = calcularPromedioEdades(estudiantesDesdeArchivo);
        System.out.println("Promedio de edades: " + promedioEdades);

        // Calcular y mostrar la cantidad de hombres y mujeres
        int cantidadHombres = contarHombres(estudiantesDesdeArchivo);
        int cantidadMujeres = contarMujeres(estudiantesDesdeArchivo);
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }

    public static void escribirEstudiantesEnArchivo(List<Estudiante> estudiantes, String nombreArchivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Estudiante estudiante : estudiantes) {
                escritor.write(estudiante.getNombre() + "," + estudiante.getEdad() + "," + estudiante.getPromedio() + "," + estudiante.getSexo() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Estudiante> leerEstudiantesDesdeArchivo(String nombreArchivo) {
        List<Estudiante> estudiantes = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    String nombre = partes[0];
                    int edad = Integer.parseInt(partes[1]);
                    double promedio = Double.parseDouble(partes[2]);
                    char sexo = partes[3].charAt(0);
                    Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
                    estudiantes.add(estudiante);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    public static double calcularPromedioCalificaciones(List<Estudiante> estudiantes) {
        double sumaCalificaciones = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaCalificaciones += estudiante.getPromedio();
        }
        return sumaCalificaciones / estudiantes.size();
    }

    public static double calcularPromedioEdades(List<Estudiante> estudiantes) {
        int sumaEdades = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaEdades += estudiante.getEdad();
        }
        return (double) sumaEdades / estudiantes.size();
    }

    public static int contarHombres(List<Estudiante> estudiantes) {
        int cantidadHombres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo() == 'M' || estudiante.getSexo() == 'm') {
                cantidadHombres++;
            }
        }
        return cantidadHombres;
    }

    public static int contarMujeres(List<Estudiante> estudiantes) {
        int cantidadMujeres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo() == 'F' || estudiante.getSexo() == 'f') {
                cantidadMujeres++;
            }
        }
        return cantidadMujeres;
    }
}
