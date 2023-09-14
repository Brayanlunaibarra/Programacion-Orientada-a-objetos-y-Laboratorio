//dados dos numeros que de el usuario la tem inicial y final 
import java.util.Scanner;
public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        double temInicial,temFinal,farenheit;
        char proceso;
        Scanner obj = new Scanner(System.in);
        //Recivimos los datos
            System.out.print("Dame la primer cifra (debe ser la menor)");temInicial=obj.nextDouble();
            System.out.print("Dame la primer cifra (debe ser la mayor)");temFinal=obj.nextDouble();
            System.out.println("-------------------");
            System.out.println("Celcius   farenheit");
        do {
            farenheit=(temInicial*1.8)+32;
            System.out.printf("\n    %.2f      %.2f", temInicial,farenheit);
            temInicial += 1;
        } while (temInicial<=temFinal);
        System.out.println("\n-------------------");
    }
}
