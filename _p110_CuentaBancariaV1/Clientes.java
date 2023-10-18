package _p110_CuentaBancariaV1;

public class Clientes {
    private String Nombre;
    private CuentasBancarias Cuenta;

    public Clientes(String nombre, CuentasBancarias cuenta){
    Nombre = nombre;
    Cuenta = cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public CuentasBancarias getCuenta() {
        return Cuenta;
    }

    public void setCuenta(CuentasBancarias cuenta) {
        Cuenta = cuenta;
    }

    @Override
    public String toString() {
    return "Cliente [ Nombre= " + Nombre + ", Cuenta Saldo = " + Cuenta.getSaldo() + "]";
    }
}
