package main.java.com.softlond.exercises.juego_cartas.clases;

import main.java.com.softlond.exercises.juego_cartas.interfaces.ICarta;

public class JuegoCartas {
    
    public void run(){
        System.out.println("Juego de cartas");
        Baraja baraja = new Baraja();
        baraja.mostrarBaraja();

        ICarta carta = baraja.sacarCarta();
        System.out.println("Carta sacada: ");
        carta.mostrarCarta();
        baraja.mostrarBaraja();
    }
}
