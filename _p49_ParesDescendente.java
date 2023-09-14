//dados dos numeros que de el susuario escribir los numeros pares y escogerlos de manera acendente , como promedio y suma 
import java.util.Scanner;
public class _p49_ParesDescendente {
    public static void main(String[] args) {
        //Declaro variables 
        int num1,num2,sumaPares,promedio,cantidadPares;
        char proceso;
        Scanner obj = new Scanner(System.in);
        //inicializamos las varibles 
        sumaPares=0;
        cantidadPares=0;
        do {
            //Recivimos los datos
            System.out.print("Dame la primer cifra (debe ser la menor)");num1=obj.nextInt();
            System.out.print("Dame la primer cifra (debe ser la mayor)");num2=obj.nextInt();
            while (num2>=num1) {
                if (num2%2==0) {
                    System.out.printf("\nlos numeros son  %2d",num2);
                        sumaPares=sumaPares +num2;
                        num2=num2-2;
                        cantidadPares += 1 ; 
                } else {
                    num2=num2-1;
                }
            }
            promedio=sumaPares/cantidadPares;
            System.out.printf("\nEl promedio de los numeros son  %2d",promedio);
            System.out.print("\nDeseas continuar (S/N) ? ");proceso = Character.toUpperCase(obj.next().charAt(0));
        } while (proceso !=  'N' );
    }
}
