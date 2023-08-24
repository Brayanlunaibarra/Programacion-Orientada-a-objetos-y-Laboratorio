import java.util.Scanner;
public class  _P10_CalcularHipotenusa {
    public static void main(String[] args) {
        double PrimerLado, SegundoLado , Hipotenusa;
        //Pedimos los datos 
        Scanner obj= new Scanner(System.in);
        System.out.println("dame el primer lado"); PrimerLado = obj.nextDouble() ;
        System.out.println("Dame el segundo lado"); SegundoLado= obj.nextDouble();
        //hace los calculos 
        Hipotenusa= Math.sqrt(PrimerLado*PrimerLado+SegundoLado*SegundoLado);
        //damos el resultado
        System.out.println("la hipotenusa tiene el valor de "+Hipotenusa);
    }
}