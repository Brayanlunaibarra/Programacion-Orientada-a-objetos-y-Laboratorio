import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("Dime un número del 1 al 6 ? ");
        System.out.println("El continente mostrado será en base al número dado \n");
        int n = new Scanner(System.in).nextInt();
        
        if(n==6) System.out.println("\nAmerica del Norte");
        if(n==5) System.out.println("\nÁfrica");
        if(n==4) System.out.println("\nAsia");
        if(n==3) System.out.println("\nAmerica del Sur");
        if(n==2) System.out.println("\nAntartida");
        if(n==1) System.out.println("\nEuropa");
        if (n > 6) System.out.println("Nani?");
        if (n < 1) System.out.println("Qué?");


    }
}