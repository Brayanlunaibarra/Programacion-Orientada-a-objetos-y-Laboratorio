package _95_Empleado02;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("juanito");
        empleado.setEdad(12);
        System.out.println(empleado);

        Empleado empleado2;
        empleado2=new Empleado();
        empleado2.setNombre("Maria de jesus");
        empleado2.setEdad(12);
        System.out.println(empleado2);
        
        System.out.println(empleado.getNombre());
        System.out.println(empleado2.getEdad());
    }
}
