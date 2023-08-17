// Manda un saludo a pantalla 

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Soledad";
        String hermana = "Arley";
        String mensaje = String.format("tanto %s como %s desean aprender java ", amigo,hermana);
        System.out.println("hola mundo desde el lenguaje java ");
        System.out.println("Hola "+ amigo + " bienvenido a java");
        System.out.println("Hola  "+ hermana + " bienvenido a java");
        System.out.println ("\n"+mensaje);

    }
}