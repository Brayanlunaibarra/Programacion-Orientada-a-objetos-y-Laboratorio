package _p120_veihiculo;

public class App  {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Sedan carro1 = new Sedan("Vochito", "Maria Diaz ", 4);
        Suv carro2= new Suv("La mamalona", "Carlos Catañeda", 6);
        System.out.println(carro1.toString());
        carro1.sistemaElectrico();
        carro1.chasisMonocasco();
        carro1.combustionInterna();
        carro1.carroceriaTres();
        carro1.repostar();
        carro1.arancar();
        carro1.frenar();
        //-----------------------------------------
        System.out.println(carro2.toString());
        carro2.sistemaElectrico();
        carro2.chasisIndependiente();
        carro2.combustionInterna();
        carro2.traccion4x4();
        carro2.repostar();
        carro2.arancar();
        carro2.frenar();

    }
}
