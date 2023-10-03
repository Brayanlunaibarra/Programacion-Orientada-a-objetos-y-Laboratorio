public class _p90_Temperaturas {
    public static void main(String[] args) {
        double mayores;
        mayores=0;
        double [] temperaturas= {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};
        System.out.println("este es el primer elemento");System.out.println(temperaturas[0]);
        System.out.println("este es el tercer elemento ");System.out.println(temperaturas[2]);
        System.out.println("estos son los elementos del arreglo ");
        for (double v : temperaturas)

            System.out.print(v + " ");
        System.out.println("estos son los elementos del arreglo que superan el 10 :)");
        for (double v : temperaturas){
            mayores=v;
            if (mayores <=10){
                System.out.print( mayores + " ");
        
            }
        }
    }
}
