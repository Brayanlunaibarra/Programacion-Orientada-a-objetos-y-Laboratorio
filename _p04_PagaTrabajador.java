// sacar los impuestos necesarios 
import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa , impuesto,pagabruta, paganeta;
        Scanner obj=new Scanner(System.in);

        System.out.println("nombre del trabajador ?");nombre= obj.nextLine();
        System.out.println("Hotas del trabajador ?");horas = obj.nextInt();
        System.out.println("paga por hora ");paga =obj.nextFloat();
        tasa =0.3;
        pagabruta= horas * paga ;
        impuesto=pagabruta*tasa;
        paganeta=pagabruta-impuesto;
        
        System.out.println("\nresumen de pagos\n");
        System.out.println(String.format("El trajador %s,trabajo %d horas con una paga %.2f pesos la hora,se asume una tasade impuestode %.2f", nombre, horas,paga,tasa));
        System.out.println(String.format("Paga bruta: %.2f",pagabruta));
        System.out.println(String.format("impuesto:%.2f",impuesto));
        System.out.println(String.format("la paga neta ",paganeta));

    }
}
