package _p120_veihiculo;

public class Maquina {
    private String Nombre , Dueño;
    private int Pasajeros;
    
    public Maquina() {
    }
    
    public Maquina(String nombre, String dueño, int pasajeros) {
        Nombre = nombre;
        Dueño = dueño;
        Pasajeros = pasajeros;
    }

    public void repostar(){
        System.out.println("Repostando ......");
    }
    public void arancar(){
        System.out.println("Arrancando");
    }
    public void frenar(){
        System.out.println("Frenando....");
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Dueño=" + Dueño + ", Pasajeros=" + Pasajeros + "]";
    }
    
}
