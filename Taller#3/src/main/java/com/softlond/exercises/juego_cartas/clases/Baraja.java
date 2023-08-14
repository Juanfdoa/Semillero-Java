package main.java.com.softlond.exercises.juego_cartas.clases;

import java.util.ArrayList;
import java.util.List;

import main.java.com.softlond.exercises.juego_cartas.interfaces.ICarta;

public class Baraja {
   private List<ICarta> cartas;

   public Baraja() {
    cartas = new ArrayList<>();

    //cartas del 2 al 10
    for (int i = 2; i <= 10; i++) {
        cartas.add(new CartaNumerada(i, "Picas"));
        cartas.add(new CartaNumerada(i, "Trebol"));
        cartas.add(new CartaNumerada(i, "Diamante"));
        cartas.add(new CartaNumerada(i, "Corazon"));
    }

    //cartas J, Q, K, A
    String letra[] = {"J", "Q", "K", "A"};
    for (int i = 0; i < 4; i++) {
        cartas.add(new CartaLiteral(letra[i], "Picas"));
        cartas.add(new CartaLiteral(letra[i], "Trebol"));
        cartas.add(new CartaLiteral(letra[i], "Diamante"));
        cartas.add(new CartaLiteral(letra[i], "Corazon"));
    }
    System.out.println(cartas.size());
   }

   public void mostrarBaraja() {
       for (ICarta carta : cartas) {
            carta.mostrarCarta();
       }
   }

   public ICarta sacarCarta() {
       int indice = (int) (Math.random() * cartas.size());
       ICarta carta = cartas.get(indice);
       cartas.remove(indice);
       return carta;
   }
}
