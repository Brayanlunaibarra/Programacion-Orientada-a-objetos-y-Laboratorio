import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int renglones;
        double numero, suma ;
        suma = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame el numero de renglones : "); 
        renglones = obj.nextInt();
        for (int i = 1; i <= renglones; i++) {
            System.out.printf("1/%d + ", i);
            numero=1.0/i;
            suma +=numero;
        }
        System.out.printf("la suma de las fraciones es %f ", suma);

    }
}
