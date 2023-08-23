import java.util.Scanner;
public class _p13_ConvertirTemperatura {
    public static void main(String[] args) {
        double Celcius, fhahrenheir;
        Scanner obj = new Scanner(System.in);
        System.out.println("Dame la temperaturaen fhahrenheir"); fhahrenheir=obj.nextDouble();
        Celcius= (fhahrenheir-32)*(5.0/9.0);
        System.out.println("los grados son "+ Celcius);
    }
}
