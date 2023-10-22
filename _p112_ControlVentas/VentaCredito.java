package _p112_ControlVentas;

public class VentaCredito extends Venta {
    private int Meses;
    private double Intereses;

    public VentaCredito(String articulo, double cantidad, double precio, int meses, double intereses) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Intereses = intereses;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int meses) {
        Meses = meses;
    }

    public double getIntereses() {
        return Intereses;
    }

    public void setIntereses(double intereses) {
        Intereses = intereses;
    }

    @Override
    public double getTotalVenta() {
        return getCantidad() * getPrecio() + (Meses * Intereses / 100) * (getCantidad() * getPrecio());
    }
}
