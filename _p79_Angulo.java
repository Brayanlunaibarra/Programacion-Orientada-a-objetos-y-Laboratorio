//lo que se quiere es que depende el angulo dado por el usuario saber que tipo de angulo es 
import java.util.Scanner;
public class _p79_Angulo {
    public static void main(String[] args) {
        float angulo;
        Scanner obj=new Scanner(System.in);
        System.out.print("Dame el angulo  : ");
        angulo = obj.nextFloat();
        if (angulo>=0 && angulo<=360) {
            if (angulo==90) {
                System.out.print("Este es un angulo recto");
            }
            if (angulo<90 ) {
                System.out.print("el angulo es agudo ");
            }
            if ((angulo>=90) || (angulo<=180)) {
                System.out.print("Es un angulo obtuso ");
            }
            if (angulo==180) {
                System.out.print("Es angulo 180 ");
            }
            if ((angulo>180)|| (angulo<=360)) {
                System.out.print("Es un angulo concavo");
            }
        } else {
            System.out.print("estan mal los datos que enviaste :(");
        
        }
    }
}
