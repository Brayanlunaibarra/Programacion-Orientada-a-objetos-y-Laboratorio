package _96_Empleado03;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("peje",2);
        System.out.println(empleado);

        Empleado empleado2;
        empleado2=new Empleado("amlo",12);
        System.out.println(empleado2);
        
        
        System.out.println(empleado.getNombre());
        System.out.println(empleado2.getEdad());
    }
}
