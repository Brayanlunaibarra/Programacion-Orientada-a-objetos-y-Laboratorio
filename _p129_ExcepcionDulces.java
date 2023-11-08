import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
          float niños,dulces,resultado;
          System.out.println("Dime el numero de los niños que estan en el barrio :");
          niños=obj.nextFloat() ;
          System.out.println("Dame el numero de los dulces");
          dulces=obj.nextFloat();
          resultado=dulces/niños;
          System.out.println("a todos les toca de "+resultado+"por cabeza" );
        } catch (InputMismatchException e) {
            System.out.println("solo acepto numeros:)");
        }catch(ArithmeticException p){
            System.out.println("NO creotener dulces para todos");
        }
    }
}
