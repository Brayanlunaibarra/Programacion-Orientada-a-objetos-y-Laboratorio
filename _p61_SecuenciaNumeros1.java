import java.util.Scanner;
public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int renglones, numero;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame el numero de renglones : "); 
        renglones = obj.nextInt();
        for (int i = 1; i <= renglones; i++) {
            numero = i;
            for (int j = 1; j <= numero; j++) {
                System.out.print(numero);
            }
            System.out.print("\n");
        }
    }
}
