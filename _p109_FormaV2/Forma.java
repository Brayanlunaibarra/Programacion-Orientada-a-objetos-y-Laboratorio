package _p109_FormaV2;

abstract class Forma {
    private String Color;
    private boolean Reyeno;
    public Forma() {
    }
    public Forma(String color, boolean reyeno) {
        Color = color;
        Reyeno = reyeno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isReyeno() {
        return Reyeno;
    }
    public void setReyeno(boolean reyeno) {
        Reyeno = reyeno;
    }
    abstract public double getArea();
    abstract public double getPerimetro();
    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Reyeno=" + Reyeno + "]";
    }
    
    
}
