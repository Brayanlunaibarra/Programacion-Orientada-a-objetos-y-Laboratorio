import java.util.Scanner;

public class _p64_SumaTerminos2 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("¿Cuántos términos? ");
    int n = teclado.nextInt();
    teclado.close();
    int suma = 0;
    int term = 0;
    for (int i = 1; i <= n; i++) {
        term = term * 10 + 1; // Genera el término de la secuencia
        suma += term; // Suma el término a la suma total
        System.out.print(term); // Imprime el término
        if (i < n) {
            System.out.print("+"); // Imprime el signo de suma si no es el último término
        }
    }
    System.out.println(); // Salto de línea
    System.out.println("Suma " + suma); // Imprime la suma total
}
}