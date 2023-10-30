package _p120_veihiculo;

public class Suv extends Maquina implements TodoTerreno,Vehiculo {
    public Suv(String nombre,String dueño,int crias){
        super (nombre,dueño,crias);    
    }
    @Override
    public void combustionInterna() {
        System.out.println("es un automovil de combustion interna esa un sedan");
        
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico  es un sedan");
        
    }
    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automovil con traccion 4x4 suv");
        
    }
    @Override
    public void traccion4x4() {
        System.out.println("Es un automovil tiene con chasis independiente suv ");
        
    }
    
}
