package _p101_TrabajoPersona;

public class Persona {
    private String nombre;
    private Trabajo trabajo;
    
    
    public Persona() {
    }
    public Persona(String nombre, Trabajo trabajo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Trabajo getTrabajo() {
        return trabajo;
    }
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", trabajo=" + trabajo + "]";
    }
    
}
