package main.java.com.softlond.exercises.banco_cuentas.clases;

import java.util.ArrayList;

public class BancoCuentas {

    public void run(){
        System.out.println("Banco y Cuentas");

        ArrayList<Cuentas> cuentas = new ArrayList<Cuentas>();

        Cuentas ahorros = new CuentaAhorros("Juan Fernando Acevedo", "123456");
        Cuentas ahorros2 = new CuentaAhorros("Juan Acevedo", "1234567");
        cuentas.add(ahorros);
        cuentas.add(ahorros2);


        Cuentas filtro = Cuentas.filtrarCuenta(cuentas, "1234567");
        if(filtro != null){
            filtro.consultarSaldo();
        }else{
            System.out.println("No se encontro la cuenta");
        }

        
      
         
        
    }
}
