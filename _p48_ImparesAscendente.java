//dados dos numeros ver los numeros que se dan por parte del usuario ver los impares entre ellos y sumar el promedio

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int numero1, numero2, suma, promedio,contador ;
        char cantidad, proceso;
        Scanner obj = new Scanner(System.in);
        suma = 0;
        contador=0;
        do {
            System.out.print("Dame la primer cifra (debe ser la menor)");numero1=obj.nextInt();
            System.out.print("Dame la primer cifra (debe ser la mayor)");numero2=obj.nextInt();
            if (numero1==numero2) {
                System.out.println("los datos no funcionan mijo");
                break;
            }
                while (numero1<=numero2) {
                    if (numero1%2==1) {
                        System.out.printf("\nlos numeros son  %2d",numero1);
                        suma=suma +numero1;
                        numero1=numero1+2;
                        contador += 1 ;

                    } else {
                        numero1=numero1-1;

                    }
                }
                promedio=suma/contador;
                System.out.printf("\nEl promedio de los numeros son  %2d",promedio);
            System.out.print("\nDeseas continuar (S/N) ? ");proceso = Character.toUpperCase(obj.next().charAt(0));
        } while (proceso != 'N');
        System.out.println("Gracias por utilixar este programa :)");
    }
}