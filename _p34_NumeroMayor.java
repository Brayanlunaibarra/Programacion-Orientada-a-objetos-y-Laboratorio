//Brayan Alejandro luna ibarra
//dado tres numeros saber que numero es mayor
import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        int dig1, dig2, dig3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingresa los numeros a verificar");
        System.out.print("Primer numero  : "); dig1 = obj.nextInt();
        System.out.print("Segundo numero : "); dig2 = obj.nextInt();
        System.out.print("Tercer numero  : "); dig3 = obj.nextInt();

        if (dig1 > dig2) {
            if (dig1 > dig3) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", dig1, dig2, dig3));
            }
        }else if (dig2 > dig1) {
            if (dig2 > dig3) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", dig2, dig1, dig3));
            }else if (dig3 > dig1) {
                if (dig3 > dig2) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", dig3, dig2, dig1));
                }
            }
        }else if (dig3 > dig1) {
            if (dig3 > dig2) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", dig3, dig2, dig1));
            }
        }

        obj.close();
    }
}