package _p115_Telefono;

public class Telefono implements Gps,Radio,Conecta {

    @Override
    public void obtenerCooerdenadas() {
        System.out.println("Buscando Cordenadas.....");
    }

    @Override
    public void detenerRadio() {
        System.out.println("Radiodetenida");
        
    }

    @Override
    public void iniciarRadio() {

        System.out.println("Musica chida activada");
        
    }

    @Override
    public void Bluetood() {
        System.out.println("Bluetood encendido");
        
    }

    @Override
    public void Wifi() {
        System.out.println("Wifi encendido ");
        
    }
    
}
