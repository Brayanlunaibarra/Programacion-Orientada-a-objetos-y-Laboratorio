package _p120_veihiculo;

public class Sedan extends Maquina implements Familiar , Vehiculo {
    public Sedan(String nombre,String dueño,int crias){
    super (nombre,dueño,crias);    
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es un automovil con carroceria en tres partes es un sedan");
        
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es un tipo failiar con chasis de monocasco es un sedan");
        
    }

    @Override
    public void combustionInterna() {
        System.out.println("es un automovil de combustion interna esa un sedan");
        
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico  es un sedan");
        
    }
    
    
}
