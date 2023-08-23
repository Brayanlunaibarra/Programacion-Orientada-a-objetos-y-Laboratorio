import java.util.Scanner;

public class  _p11_CalcularAngulo {
    public static void main(String[] args) {
        double PrimerAngulo, SegundoAngulo , tercerAngulo;
        //Pedimos los datos 
        Scanner obj= new Scanner(System.in);
        System.out.println("dame el primer angulo"); PrimerAngulo = obj.nextDouble() ;
        System.out.println("Dame el segundo angulo"); SegundoAngulo= obj.nextDouble();
        //hace los calculos 
        tercerAngulo= 180-(PrimerAngulo+SegundoAngulo);
        //damos el resultado 
        System.out.println("el tercer angulo tiene el valor de "+tercerAngulo);
    }
}