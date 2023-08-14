package main.java.com.softlond.exercises.juego_cartas.clases;

import main.java.com.softlond.exercises.juego_cartas.interfaces.ICarta;

public class CartaLiteral implements ICarta {
    private String letra;
    private String palo;

    public CartaLiteral(String letra, String palo) {
        this.letra = letra;
        this.palo = palo;
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta literal: " + letra + " de " + palo);
    }

    @Override
    public int valorNumerico() {
        return 0;
    }
    
}
