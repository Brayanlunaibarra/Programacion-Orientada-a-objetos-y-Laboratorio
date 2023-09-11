//Brayan Alejandro Luna Ibarra 
//dados stres numeros el programa debe saber si estos tres numeros son consecutivos:)
import java.util.Scanner;
public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
           int num1,num2,num3;
            Scanner obj = new Scanner(System.in);
            System.out.print("Dime el primer numero "); num1 = obj.nextInt();
            System.out.print("Dime el segundo numero "); num2 = obj.nextInt();
            System.out.print("Dime el tercer nummero "); num3 = obj.nextInt();
            if (num2 == num1 + 1 && num3 == num2 + 1) {
                System.out.println("Los números son consecutivos.");
            } else {
                System.out.println("Los números no son consecutivos.");
            }
            obj.close(); 
        }
    }    