package _p110_CuentaBancariaV1;

public class CuentasBancarias {

    private double Saldo;

    public CuentasBancarias(double cantidad) {
    Saldo = cantidad;
    }

    public void deposita(double cantidad) {
        Saldo += cantidad;
    }

    public double getSaldo() {
        return Saldo;
    }

    public boolean retira(double cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        } else
            return false;
    }

}
