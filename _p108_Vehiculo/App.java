package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Camioneta C1 = new Camioneta("coreerecio", "Flash",2019, 20010.30, 4, 2000.10);
        Camioneta C2 = new Camioneta("123455", "fLAZH",2018, 2019221212.30, 3, 2344537.60);
        Compacto C3= new Compacto("jjajajaj","Flazh",3123,12374284847.737474,6,4);
        Compacto C4= new Compacto("jajaja","Flazh",2021,12121213.3,8,15);
        Veiculos[] veiculos= {C1,C2,C3,C4};
        System.out.println("Datos De cada veiculo ");
        for (Veiculos i:veiculos ){
            System.out.println(i);
        }
        System.out.println("Suma de los precios de cada coche ");
        double Totalprecio=0;
        for(Veiculos i: veiculos){
            Totalprecio= i.getPrecio();
            System.out.println(i.getPrecio());
        }
        System.out.println("Lasuma de los precios es :"+Totalprecio);
    }
}
