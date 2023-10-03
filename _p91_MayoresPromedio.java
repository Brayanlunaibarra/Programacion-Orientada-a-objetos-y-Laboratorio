import java.util.Scanner;
public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        int n;
        float cantidades, suma,promedio;
        promedio=0;
        suma=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("¿cuantos numeros vas a añadir ?");
        n = obj.nextInt();
        float[] califs = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("dame el elemento correspondiente: ");
            cantidades = obj.nextFloat();
            suma += cantidades;
            califs[i] = cantidades;
        }
        promedio=suma/n;
        for (float f : califs) {
            if (f>=promedio) {
                System.out.print( f + " ");
            }
        }
    }
}
