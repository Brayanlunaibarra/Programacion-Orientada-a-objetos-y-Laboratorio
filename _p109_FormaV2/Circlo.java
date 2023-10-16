package _p109_FormaV2;

public class Circlo extends Forma {
    private double Radio;
    
    // Constructor con parámetros
    public Circlo(String color, boolean reyeno, double radio) {
        super(color, reyeno); // Llamada al constructor de la superclase
        Radio = radio;
    }
    
    // Método get para el radio
    public double getRadio() {
        return Radio;
    }
    
    // Método set para el radio
    public void setRadio(double radio) {
        Radio = radio;
    }
    
    // Método para calcular el área de un círculo
    @Override
    public double getArea() {
        return Math.PI * Radio * Radio; // Usamos la constante Math.PI para el valor de pi
    }
    
    // Método para calcular el perímetro de un círculo
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Radio; // Usamos la constante Math.PI para el valor de pi
    }
    
    // Método para mostrar la información de un círculo
    @Override
    public String toString() {
        return "Circlo [Radio=" + Radio + ", Color=" + getColor() + ", Reyeno=" + isReyeno() + "]";
    }
}
