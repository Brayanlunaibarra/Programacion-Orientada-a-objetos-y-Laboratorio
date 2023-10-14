

// Clase Punto que modela las coordenadas de un punto
public class Punto {
    // Atributos
    private int x; // Coordenada x del punto
    private int y; // Coordenada y del punto

    // Constructor por defecto
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos de acceso
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Métodos de modificación
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método toString
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}