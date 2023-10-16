package _p108_Vehiculo;

public class Veiculos {
    private String Serie, marca;
    private int Año;
    private double precio;
    public Veiculos() {
    }
    public Veiculos(String serie, String marca, int año, double precio) {
        Serie = serie;
        this.marca = marca;
        Año = año;
        this.precio = precio;
    }
    public String getSerie() {
        return Serie;
    }
    public void setSerie(String serie) {
        Serie = serie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Veiculos [Serie=" + Serie + ", marca=" + marca + ", Año=" + Año + ", precio=" + precio + "]";
    }
    
}
