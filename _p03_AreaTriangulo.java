//calcular la area de un triangulo 

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
    int base ,altura;
    double area;
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Dame la base");
    base = obj.nextInt();
    System.out.println("dame la altura");
    altura =obj.nextInt();
    area = base * altura/ 2;
    System.out.println(String.format("El triangulo de base %d y la altura de %d tiene un area de %f", base,altura,area));
    }
}
