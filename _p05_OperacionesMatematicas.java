public class _p05_OperacionesMatematicas {
    public static void main(String[] args) {
        double x , y, suma, resta,division,multiplicacion,residuo,potencia;
        x=10.5; 
        y=2.5;
        suma=x+y;
        resta=x-y;
        division=x/y;
        multiplicacion=x*y;
        residuo=x%y;
        potencia=Math.pow(x, y);
        System.out.println(String.format("los numeros son: %.2f, %.2f", x,y));
        System.out.println("El resultado de las operaciones es el siguiente:");
        System.out.println(String.format("suma: %.2f \nResta:%.2f", suma,resta));
        System.out.println(String.format("Multiplicacion: %.2f \nDivsion:%.2f", multiplicacion ,division));
        System.out.println(String.format("Residuo: %.2f \nPotencia:%.2f",residuo,potencia));
    }
}