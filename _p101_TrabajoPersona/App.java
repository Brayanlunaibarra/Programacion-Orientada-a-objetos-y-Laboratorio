package _p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        Trabajo trabajo= new Trabajo();
        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(12);
        persona1.setNombre("brayan");
        persona1.setTrabajo(trabajo);
        System.out.println(persona1.toString());
    }
}
