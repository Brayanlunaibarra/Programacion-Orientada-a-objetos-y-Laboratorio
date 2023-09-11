import java.util.Scanner;

public class _p38_AceptarEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        char sexo;
        int años;
        double cal1, cal2, cal3, prom;

        System.out.println("Solicitud de Admisión - Universidad Kitty Kat SA");
        //Vaya nombre
        System.out.print("Ingresa tu nombre: "); nombre = scanner.nextLine();
        System.out.print("¿Cuál es tu sexo? (h/m): "); sexo = scanner.nextLine().charAt(0);
        System.out.print("Ingrese tu edad, estudiante: "); años = Integer.parseInt(scanner.nextLine());
        System.out.print("Dime tu primera calificación: "); cal1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Dime tu segunda calificación: "); cal2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Dime tu tercera calificación: "); cal3 = Double.parseDouble(scanner.nextLine());
        
        prom = (cal1 + cal2 + cal3) / 3;

        if (sexo == 'm' && años > 21 && prom >= 8 && prom <= 9.5) {
            System.out.println("\n¡Felicidades, " + nombre + "! Has sido aceptada en la Universidad Kitty Kat");
        } else {
            System.out.println("\nLo siento, " + nombre + "No has sido aceptado");
        }

        scanner.close();
    }
}