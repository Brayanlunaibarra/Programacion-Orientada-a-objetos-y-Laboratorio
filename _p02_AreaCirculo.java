//calcular el area de un circulo 

import java.util.Scanner ;

public class _p02_AreaCirculo{
    public static void main (String []args){
        double radio, area ;
        Scanner lradio = new Scanner(System.in);

        System.out.print("dame el radio del circulo ? ");
        radio= lradio.nextFloat();

        area= Math.PI * Math.pow(radio,2);

        System.out.println("el circulo de radio   " + radio+"tiene un area de "+ area);

    }
}
