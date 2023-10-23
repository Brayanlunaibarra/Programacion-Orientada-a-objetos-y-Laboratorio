package _p113_SegudoExamenParcial;

public class JugadorActivo extends Jugador {
    private int partidos,goles ;

    public JugadorActivo(){

    }


    public JugadorActivo(String nombre,  char sexo,String direccion, int salario, int partidos, int goles) {
        super(nombre, direccion, sexo, salario);
        this.partidos = partidos;
        this.goles = goles;

    }
    public  double getBono(){
        return(Salario * 0.10) + (partidos * 50) + (goles * 5);
    }
    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Direccion=" + Direccion + ", Sexo=" + Sexo + ", Salario=" + Salario +"partidos=" + partidos + ", goles=" + goles + "total= "+ Salario+getBono()+"]";
    }
}
