package _p112_ControlVentas;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String propietario;
    private String domicilio;
    private List<Clientes> clientes;

    public Tienda(String propietario, String domicilio) {
        this.propietario = propietario;
        this.domicilio = domicilio;
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Clientes cliente) {
        clientes.add(cliente);
    }

    public double getTotal() {
        double total = 0;
        for (Clientes cliente : clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }
    @Override
    public String toString() {
        return "Tienda [Propietario= " + propietario + ", Domicilio= " + domicilio + ", Clientes= " + clientes.size() + ", Total = " + getTotal() + "]";
    }
}