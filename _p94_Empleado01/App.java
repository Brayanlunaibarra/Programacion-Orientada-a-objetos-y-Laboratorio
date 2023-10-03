package _p94_Empleado01;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.Nombre="juanito";
        empleado.edad=12;
        System.out.println(empleado);

        Empleado empleado2;
        empleado2=new Empleado();
        empleado2.Nombre="Maria de jesisu";
        empleado2.edad=12;
        System.out.println(empleado2);
        
        System.out.println(empleado.Nombre);
        System.out.println(empleado2.Nombre);
        

    }
}
