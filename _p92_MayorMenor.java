import java.util.Scanner;
public class _p92_MayorMenor {
    public static void main(String[] args) {
        int n;
        float division, cantidad1,cantidad2,cantidad3 ;
        cantidad2=0;
        cantidad3=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("¿cuantos numeros vas a añadir ?");
        n = obj.nextInt();
        float[] califs = new float[n];
        System.out.print("dame el elemento correspondiente: ");
        cantidad1 = obj.nextFloat();
        cantidad3=cantidad1;
        for (int i = 1; i < n; i++) {
            califs[i] = cantidad1;
            System.out.print("dame el elemento correspondiente: ");
            cantidad1 = obj.nextFloat();
            

            if (cantidad1>cantidad2) {
                cantidad2=cantidad1;
            }
            if (cantidad1<cantidad3) {
                cantidad3=cantidad1;
            }
        }
        System.out.print("los numeros son ");
        for (float f : califs) {
            System.out.print( f + " ");
        }
        System.out.printf("El elemento mas pequeño es %.2f y el elemento mas grande es %.2f",cantidad3,cantidad2);

    }
}
