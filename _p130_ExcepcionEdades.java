import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            int edad1,edad2,edad3,edad4,edad5;
            System.out.println("Dame la primer edad");
            edad1=obj.nextInt();
            System.out.println("Dame la siguiente");
            edad2=obj.nextInt();
            System.out.println("Dame la siguiente");
            edad3=obj.nextInt();
            System.out.println("Dame la siguiente");
            edad4=obj.nextInt();
            System.out.println("Dame la siguiente");
            edad5=obj.nextInt();
            List edades = Arrays.asList(edad1,edad2,edad3,edad4,edad5);
            System.out.println(edades);

        } catch (Exception e) {
            System.out.println("solo numeros:)");
        }
    }
}
