import java.util.Scanner;
public class  _p13_VolumenCilindrico {
    public static void main(String[] args) {
        double Radio, Altura , volumen;
        //Pedimos los datos 
        Scanner obj= new Scanner(System.in);
        System.out.println("dame el Radio"); Radio = obj.nextDouble() ;
        System.out.println("Dame el Altura"); Altura= obj.nextDouble();
        //hace los calculos 
        volumen=Math.PI*(Radio*Radio)*Altura;
        //damos el resultado
        System.out.println("El Volumen  tiene el valor de "+volumen);
    }
}