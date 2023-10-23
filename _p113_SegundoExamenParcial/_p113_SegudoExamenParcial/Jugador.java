package _p113_SegudoExamenParcial;

abstract class Jugador {
    protected String Nombre, Direccion;protected char Sexo;private double Total;
    protected int Salario;
    public Jugador() {
    }
    public Jugador(String nombre, String direccion, char sexo, int salario) {
        Nombre = nombre;
        Direccion = direccion;
        Sexo = sexo;
        Salario = salario;
    }
    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Direccion=" + Direccion + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
    }
    

}
