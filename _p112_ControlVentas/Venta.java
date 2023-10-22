package _p112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private double Cantidad, Precio;

    public Venta(String articulo, double cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public abstract double getTotalVenta();
}