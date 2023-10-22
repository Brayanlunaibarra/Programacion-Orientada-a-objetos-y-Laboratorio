package _p112_ControlVentas;
import java.util.ArrayList;
import java.util.List;

public class Clientes {

    private String Nombre, Domicilio, Correo;
    private List<Venta> ventas;

    public Clientes(String nombre, String domicilio, String correo) {
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
        ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public double getTotal() {
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
        @Override
    public String toString() {
        return "Cliente [ Nombre= " + Nombre + ", Domicilio= " + Domicilio + ", Correo= " + Correo + ", Ventas= " + ventas.size() + ", Total=" + getTotal() + " ]";
    }
}
