import java.util.Scanner;
public class  _p14_CalculoTiempo {
    public static void main(String[] args) {
        double horas, minutos , Dias ,segundos;
        //Pedimos los datos 
        Scanner obj= new Scanner(System.in);
        System.out.println("dame las horas "); horas = obj.nextDouble() ;
        //hace los calculos 
        Dias = (horas/24.00);
        minutos= (horas*60.00);
        segundos=(minutos*60.00);

        //damos el resultado
        System.out.printf("los calculos de las horas %.2f, que son  %.2f dias ,que son %.2f minutos,que son %.2f minutos    ", horas,Dias,minutos,segundos);
    }
}