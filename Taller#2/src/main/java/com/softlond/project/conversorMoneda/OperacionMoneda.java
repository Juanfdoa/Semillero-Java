package main.java.com.softlond.project.conversorMoneda;

public class OperacionMoneda {
    public static final double PESO_DOLLAR = 0.00025;
    public static final double DOLLAR_PESO = 4051.22;
    public static final double PESO_EURO = 0.00023;
    public static final double EURO_PESO = 4446.82;
    public static final double DOLLAR_EURO = 0.91;
    public static final double EURO_DOLLAR = 1.10;

    public double pesoDollar(double cantidad){
        return cantidad * PESO_DOLLAR;
    }

    public double dollarPeso(double cantidad){
        return cantidad * DOLLAR_PESO;
    }

    public double pesoEuro(double cantidad){
        return cantidad * PESO_EURO;
    }

    public double euroPeso(double cantidad){
        return cantidad * EURO_PESO;
    }

    public double dollarEuro(double cantidad){
        return cantidad * DOLLAR_EURO;
    }

    public double euroDollar(double cantidad){
        return cantidad * EURO_DOLLAR;
    }
    
}
