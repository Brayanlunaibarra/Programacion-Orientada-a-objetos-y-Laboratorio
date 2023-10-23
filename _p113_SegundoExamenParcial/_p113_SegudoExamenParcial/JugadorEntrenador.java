package _p113_SegudoExamenParcial;

public class JugadorEntrenador extends Jugador{
    private int Subordinados,Proyectos;
    public JugadorEntrenador(){
        
    }
    public JugadorEntrenador(String nombre,  char sexo, String direccion, int salario, int subordinados,
            int proyectos) {
        super(nombre, direccion, sexo, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }
    public double getBono(){
        return(Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
    }
    @Override
    public String toString() {
        return "JugadorEntrenador[Nombre=" + Nombre + ", Direccion=" + Direccion + ", Sexo=" + Sexo + ", Salario=" + Salario+"Subordinados=" + Subordinados + ", Proyectos=" + Proyectos  + "total= "+ Salario+getBono()+"]";
    }
    

}
