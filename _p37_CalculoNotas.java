import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {

        float cal1, cal2, cal3, cal4, cal5, prom;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingresa las calificaciones: ");
        System.out.print("Primera Calificacion: "); cal1 = obj.nextInt();
        System.out.print("Segunda Calificacion: "); cal2 = obj.nextInt();
        System.out.print("Tercera Calificacion: "); cal3 = obj.nextInt();
        System.out.print("Cuarta Calificacion: "); cal4 = obj.nextInt();
        System.out.print("Quinta Calificacion: "); cal5 = obj.nextInt();

        prom = (cal1 + cal2 + cal3 + cal4 + cal5)/5;

        if ((prom > 0) && (prom <= 6)) {
            System.out.print(String.format("El promedio es: %.2f\nTe la pelas ", prom));
        }
        else if ((prom > 6) && (prom <=7)) {
            System.out.print(String.format("El promedio es: %.2f\nPor poco", prom));
            
        }
        else if ((prom > 7) && (prom <=8)) {
            System.out.print(String.format("El promedio es: %.2f\nMeh, pudo ser mejor", prom));
        }
        else if ((prom > 8) && (prom <=9)) {
            System.out.print(String.format("El promedio es: %.2f\nRifado, bro", prom));
        }
        else if ((prom > 9) && (prom <=10)) {
            System.out.print(String.format("El promedio es: %.2f\nCasi te considero una persona, bien hecho", prom));
        }
        obj.close();
    }
}