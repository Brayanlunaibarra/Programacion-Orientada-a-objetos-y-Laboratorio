package _p109_FormaV2;

public class App {
    public static void main(String[] args) {
        Forma f1= new Circlo("Rojo", true, 12);
        Forma f2= new Circlo("Verde", true, 23);
        Forma f3 = new Rectangulo("Azul",true,24,23);
        Forma f4 = new Rectangulo("Blanco", true, 12,99);
        Forma[] Figuras= {f1,f2,f3,f4};
        System.out.println("Todas las formas :");
        for (Forma i :Figuras){
            System.out.println(i);
        
        }
        System.out.println("Calculando areas y perimetros de las figuras");
        for (Forma i:Figuras){
            System.out.println("la forma es un "+ i.getClass().getSimpleName());
            System.out.println("El area es un "+ i.getArea());
            System.out.println("El perimetro es "+ i.getPerimetro());
        }
    }
}
