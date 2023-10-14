package _p105_PuntoTriangulo;
public class Punto {
    private int x, y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(Punto otroPunto) {
        double dx = this.x - otroPunto.x;
        double dy = this.y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }
    
}