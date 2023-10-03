package _96_Empleado03;

public class Empleado {
    private String Nombre;
    private int edad;
    public Empleado(){

    }
    public Empleado(String nombre, int edad){
        Nombre=nombre;
        this.edad=edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", edad=" + edad + "]";
    }
}
