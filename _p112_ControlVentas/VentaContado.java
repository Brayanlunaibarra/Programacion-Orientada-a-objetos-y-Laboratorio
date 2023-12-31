package _p112_ControlVentas;
public class VentaContado extends Venta {
    private double Descuento;
    private String Regalo;

    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        Descuento = descuento;
        Regalo = regalo;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public String getRegalo() {
        return Regalo;
    }

    public void setRegalo(String regalo) {
        Regalo = regalo;
    }

    @Override
    public double getTotalVenta() {
        return getCantidad() * getPrecio() * (1 - Descuento / 100);
    }
}