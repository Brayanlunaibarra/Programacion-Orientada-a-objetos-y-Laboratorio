package _p109_FormaV2;

public class Rectangulo extends Forma {
    private double Largo;
    private double Ancho;

    public Rectangulo() {
    }

    public Rectangulo(String color, boolean reyeno, double largo, double ancho) {
        super(color, reyeno);
        Largo = largo;
        this.Ancho = ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        this.Ancho = ancho;
    }

    @Override
    public double getArea(){
        return Largo*Ancho;
    }
    @Override
    public double getPerimetro() {
        return (Largo*2)+(Ancho*2);
    }

    @Override
    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}