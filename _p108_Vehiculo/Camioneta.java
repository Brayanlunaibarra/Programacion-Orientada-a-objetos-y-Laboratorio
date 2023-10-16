package _p108_Vehiculo;

public class Camioneta extends Veiculos {
    private int Eje;
    private double Capacidad;
    public Camioneta() {
        super();
    }
    public Camioneta(String serie, String marca, int año, double precio, int eje, double capacidad) {
        super(serie, marca, año, precio);
        Eje = eje;
        Capacidad = capacidad;
    }
    public int getEje() {
        return Eje;
    }
    public void setEje(int eje) {
        Eje = eje;
    }
    public double getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(double capacidad) {
        Capacidad = capacidad;
    }
    @Override
    public String toString() {
        return "Camioneta [Eje=" + Eje + ", Capacidad=" + Capacidad + "]";
    }
}
