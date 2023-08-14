package main.java.com.softlond.exercises.juego_cartas.clases;

import main.java.com.softlond.exercises.juego_cartas.interfaces.ICarta;

public class CartaNumerada implements ICarta{
    private int numero;
    private String palo;

    public CartaNumerada(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta numerada: " + numero + " de " + palo);
    }

    @Override
    public int valorNumerico() {
        return numero;
    }
    
}
