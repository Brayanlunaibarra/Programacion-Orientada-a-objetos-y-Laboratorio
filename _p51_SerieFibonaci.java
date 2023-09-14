// se hace el proceso fibbonaci.
import java.util.Scanner;
public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        double max, suma, num1,num2;
        Scanner obj = new Scanner(System.in);
        System.out.println("dame la cifra maxima : ");max=obj.nextDouble();
        suma=0;
        num1=1;
        num2=0;
        System.out.println("la sucesion Fibonacci es :");
        while (suma<=max) {
            if (suma == 0) {
                System.out.printf(" %.0f", suma);
                suma=num1+num2;
                
            } else {
                System.out.printf(" %.0f", suma);
               if (num1<num2) {
                suma=num1+num2;
                num1=suma;
               } else {
                suma=num1+num2;
                num2=suma;
               }
                 
            }
        }
    }
}
