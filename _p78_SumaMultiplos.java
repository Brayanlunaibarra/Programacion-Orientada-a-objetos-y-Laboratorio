//dados tres numeros y una opciion entre 4 y 3 tomar los multiplos de tres y cuatro 
import java.util.Scanner;
public class _p78_SumaMultiplos {
    public static float SumaRango(float ini, float fin,float tipo) {
        float s = 0;
        if (tipo==3) {
            for (float i = 3; i <= fin; i+=3)

            s += i;
            return s;
        }
        if (tipo==4) {
            for (float i = 4; i <= fin; i+=4)

            s += i;
            return s;
        }
        return s; 
    }

    public static void main(String[] args) {
        float i, f, res ,tipo;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {

            System.out.print("Dame inicio : ");
            i = obj.nextFloat();
            System.out.print("Dame fin : ");
            f = obj.nextFloat();
            System.out.print("Dame el tipo de numeros 3 o 4 : ");
            tipo=obj.nextFloat();

        } while (i > f);
        res = SumaRango(i, f,tipo);
        System.out.printf("\nLa suma del rango es %.2f", res);
    }
}
