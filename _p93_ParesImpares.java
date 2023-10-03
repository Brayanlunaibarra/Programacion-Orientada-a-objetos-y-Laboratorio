import java.util.Random;

public class Programa {

    // Declara dos arreglos de números enteros de una cantidad MAX 100
    public static final int MAX = 100;
    public static int[] a = new int[MAX];
    public static int[] b = new int[MAX];

    public static void main(String[] args) {
        // Rellena el arreglo a[] con números aleatorios entre 0 y 20
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);
        }

        // Muestra elementos del arreglo
        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Muestra solo los elementos que son pares y los cuenta
        System.out.println("Los elementos pares del arreglo son:");
        int contadorPares = 0;
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                contadorPares++;
            }
        }
        System.out.println();

        // Muestra solo los elementos que son impares y los cuenta
        System.out.println("Los elementos impares del arreglo son:");
        int contadorImpares = 0;
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                contadorImpares++;
            }
        }
        System.out.println();

        // Muestra la cuenta de pares
        System.out.println("La cantidad de elementos pares es: " + contadorPares);

        // Muestra la cuenta de impares
        System.out.println("La cantidad de elementos impares es: " + contadorImpares);
    }
}
