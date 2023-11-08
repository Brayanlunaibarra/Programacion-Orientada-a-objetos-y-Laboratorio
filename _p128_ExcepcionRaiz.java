import java.util.Scanner;
public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("dame el numero que quieres que te diga que saque raiz");
            float numero1= obj.nextInt();
            float resultado= (float) Math.sqrt(numero1);
            System.out.println("El resultado es :"+resultado);
        } catch (Exception e) {
            System.out.println("no manche mijo solo numeros");
        }
    }
}
