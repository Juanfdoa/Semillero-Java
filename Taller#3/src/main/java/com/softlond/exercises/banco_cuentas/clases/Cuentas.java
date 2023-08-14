package main.java.com.softlond.exercises.banco_cuentas.clases;

import java.util.ArrayList;
import java.util.UUID;

import main.java.com.softlond.exercises.banco_cuentas.interfaces.ICuenta;

public abstract class Cuentas implements ICuenta{
    protected String numero;
    protected double saldo;
    protected String titular;
    protected String docTitular;
    protected String tipo;

    public Cuentas(String titular, String docTitular, String tipo) {
        this.numero = UUID.randomUUID().toString();
        this.saldo = 0;
        this.titular = titular;
        this.docTitular = docTitular;
        this.tipo = tipo;
    }

    public static Cuentas filtrarCuenta(ArrayList<Cuentas> cuentas, String string) {
        for (Cuentas cuenta : cuentas) {
            if (cuenta.docTitular.equals(string)) {
                return cuenta;
            }
        }
        return null;
    }
}
