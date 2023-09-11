
import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        //Nunca odié tanto la pizza

        char op;
        float finalpre, desc, finaldesc, Chica, Mediana, Grande, Prechi, Premed, Pregra;
        Scanner obj = new Scanner(System.in);

        System.out.println("Elija el tamaño de las pizzas:");
        System.out.print("[C] Pizza Chica\n");
        System.out.print("[M] Pizza Mediana\n");
        System.out.print("[G] Pizza Grande\n");
        System.out.print("Elije una opcion: ");
        op = Character.toUpperCase(obj.next().charAt(0) );

        Prechi = 5; Premed = 10; Pregra = 20;
        desc = 0; finalpre = 0; finaldesc = 0;

        if (op == 'C') {
            System.out.println("\nPedido de Pizzas chicas\n");
            System.out.print("Ingrese la cantidad de pizzas que desea comprar:"); Chica = obj.nextInt();
            finalpre = Chica * Prechi;
            
            if (finalpre > 2000) {
                desc = (float) (finalpre * 0.15);
                finaldesc = finalpre - desc;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",Chica));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",finalpre));
                System.out.print(String.format("Descuento: %.2f  \n",desc));
                System.out.print(String.format("Precio con descuento: %.2f  \n",finaldesc));
            }
            else if (finalpre < 2000) {
                finaldesc = finalpre - desc;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",Chica));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",finalpre));
                System.out.print(String.format("Descuento: %.2f  \n",desc));
                System.out.print(String.format("Precio con descuento: %.2f  \n",finaldesc));

            }    
        }
        else if (op == 'M') {
            System.out.println("\nPedido de Pizzas medianas\n");
            System.out.print("Ingrese la cantidad de pizzas que desea comprar:"); Mediana = obj.nextInt();
            finalpre = Mediana * Premed;
            
            if (finalpre > 2000) {
                desc = (float) (finalpre * 0.15);
                finaldesc = finalpre - desc;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",Mediana));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",finalpre));
                System.out.print(String.format("Descuento: %.2f  \n",desc));
                System.out.print(String.format("Precio con descuento: %.2f  \n",finaldesc));
            }
            else if (finalpre < 2000) {
                finaldesc = finalpre - desc;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",Mediana));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",finalpre));
                System.out.print(String.format("Descuento: %.2f  \n",desc));
                System.out.print(String.format("Precio con descuento: %.2f  \n",finaldesc));

            }
        }
        else if (op == 'G') {
            System.out.println("\nPedido de Pizzas grandes\n");
            System.out.print("Ingrese la cantidad de pizzas que desea comprar:"); Grande = obj.nextInt();
            finalpre = Grande * Pregra;
            
            if (finalpre > 2000) {
                desc = (float) (finalpre * 0.15);
                finaldesc = finalpre - desc;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",Grande));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",finalpre));
                System.out.print(String.format("Descuento: %.2f  \n",desc));
                System.out.print(String.format("Precio con descuento: %.2f  \n",finaldesc));
            }
            else if (finalpre < 2000) {
                finaldesc = finalpre - desc;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",Grande));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",finalpre));
                System.out.print(String.format("Descuento: %.2f  \n",desc));
                System.out.print(String.format("Precio con descuento: %.2f  \n",finaldesc));

            }
        }
        else{
            System.out.println("\nOpcion Invalida \n");
            
        }
    obj.close();    
    }
}