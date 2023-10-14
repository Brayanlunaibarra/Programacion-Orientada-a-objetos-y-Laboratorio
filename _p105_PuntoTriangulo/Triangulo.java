// Clase Triangulo que modela un triángulo con 3 vértices
public class Triangulo {
    // Atributos
    private Punto v1; // Vértice 1 del triángulo
    private Punto v2; // Vértice 2 del triángulo
    private Punto v3; // Vértice 3 del triángulo

    // Constructor por defecto
    public Triangulo() {
        this.v1 = new Punto();
        this.v2 = new Punto();
        this.v3 = new Punto();
    }

    // Constructor con parámetros
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Métodos de acceso
    public Punto getV1() {
        return v1;
    }

    public Punto getV2() {
        return v2;
    }

    public Punto getV3() {
        return v3;
    }

    // Métodos de modificación
    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    // Método que calcula la distancia entre dos puntos
    private double distancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    // Método que calcula el perímetro del triángulo
    public double getPerimetro() {
        return distancia(v1, v2) + distancia(v2, v3) + distancia(v3, v1);
    }

    // Método que determina el tipo de triángulo según sus lados
    public String getTipo() {
        double d12 = distancia(v1, v2); // Distancia entre V1 y V2
        double d23 = distancia(v2, v3); // Distancia entre V2 y V3
        double d31 = distancia(v3, v1); // Distancia entre V3 y V1

        if (d12 == d23 && d12 == d31) { // Si todos los lados son iguales
            return "Equilatero";
        } else if (d12 == d23 || d12 == d31 || d23 == d31) { // Si dos lados son iguales
            return "Isoseles";
        } else { // Si ningún lado es igual
            return "Escaleno";
        }

    }

    // Método toString
    public String toString() {
        return "Triangulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}