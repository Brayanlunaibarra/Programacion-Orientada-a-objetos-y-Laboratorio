import java.util.Scanner;

public class  _p17_ConveritirADollares {
    public static void main(String[] args) {
        double Pesos,dollares,cotizacion;
        //Pedimos los datos 
        Scanner obj= new Scanner(System.in);
        System.out.println("dame la cifra de pesos "); dollares = obj.nextDouble() ;
        System.out.println("Dame la cotizacion actual"); cotizacion= obj.nextDouble();
        //hace los calculos 
        Pesos=dollares/cotizacion;
        //damos el resultado 
        System.out.println("los dollares que corresponden son son  "+Pesos);
    }
}