package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Clientes> Clientes;

    public Banco() {
        Clientes = new ArrayList<>();
    }

    public Banco(String nombre, String domicilio) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }

    public void agregarCliente(Clientes cliente) {
        Clientes.add(cliente);
    }

    public ArrayList<Clientes> getClientes() {
        return Clientes;
    }

    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" +
                Domicilio + ", Clientes=" + Clientes.size() + "]";
    }
}