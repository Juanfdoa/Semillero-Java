package main.java.com.softlond.exercises.banco_cuentas.clases;

public class CuentaCorriente extends Cuentas {
    public CuentaCorriente(String titular, String docTitular) {
        super(titular, docTitular, "Corriente");
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            Double valorTransaccion = monto * 0.006;
            saldo -= valorTransaccion;
            System.out.println("Retiro exitoso");
            System.out.println("Retiro: " + monto);
            System.out.println("Valor transaccion (0.4%): " + valorTransaccion);
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("No tiene saldo suficiente en tu corriente");
        }
    }

    @Override
    public void depositar(double monto) {
        this.saldo += monto;
        Double intereses = monto * 0.002;
        this.saldo += intereses;
        System.out.println("Deposito exitoso");
        System.out.println("Deposito: " + monto);
        System.out.println("Interese: " + intereses);
        System.out.println("Saldo actual: " + saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Numero de cuenta: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Documento: " + this.docTitular);
        System.out.println("Tipo de cuenta: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
    }
    
}
