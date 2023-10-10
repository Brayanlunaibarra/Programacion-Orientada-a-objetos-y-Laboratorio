package _p101_TrabajoPersona;

public class Trabajo {
    private int id;
    private String rol;
    private double salario;
    
    public Trabajo(int id, String rol, double salario) {
        this.id = id;
        this.rol = rol;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajo [id=" + id + ", rol=" + rol + ", salario=" + salario + "]";
    }

    public Trabajo() {
    }
    
    
}
