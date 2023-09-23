//programa con funcinoes que conviete de pulgadas a centimetros y otro de pies a pulgadas 
import java.util.Scanner;
public class _p77_MedidasLongitud {
    public static double ConversionPulgadas (double centimetros,double pulgadas ){
        pulgadas = centimetros / 2.54;
        return pulgadas;
    }
    public static double ConversionPies (double metros,double pies){
        pies = metros * 3.28;
        return pies;
        
    }
    public static void main(String[] args) {
        double centimetros,pulgadas,pies,metros;
        String opcion;
        Scanner obj=new Scanner(System.in);
        System.out.print("quieres convertir centimetor a pulgadas (escribe C) o quieres convertir metros a pies (escribe M)");opcion=obj.next();
    switch (opcion) {
        case "M":
            System.out.print("Ingresa los metros: ");metros=obj.nextDouble();
            pies=0;
            ConversionPies(metros,pies);
            System.out.print(ConversionPies(metros,pies));
            break;
            
        case"C":
            System.out.print("Ingresa los centímetros: ");centimetros=obj.nextDouble();
            pulgadas=0;
            ConversionPulgadas (centimetros,pulgadas);
            System.out.print(ConversionPulgadas (centimetros,pulgadas));
    
        default:System.out.println("los datos dados son incorrectos ");
            break;
       
    }

}
}
