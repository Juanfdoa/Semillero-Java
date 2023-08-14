package main.java.com.softlond.exercises.banco_cuentas.interfaces;

public interface ICuenta {
    public void retirar(double monto);
    public void depositar(double monto);
    public void consultarSaldo();
}
