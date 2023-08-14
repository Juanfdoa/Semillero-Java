package main.java.com.softlond.exercises.animales_sonidos;

import java.util.ArrayList;
import java.util.List;

import main.java.com.softlond.exercises.animales_sonidos.clases.Animal;
import main.java.com.softlond.exercises.animales_sonidos.clases.Gato;
import main.java.com.softlond.exercises.animales_sonidos.clases.Pajaro;
import main.java.com.softlond.exercises.animales_sonidos.clases.perro;

public class AnimalesSonidos {
    public void run(){
        System.out.println("Animales y sonidos");

        List<Animal> animales = new ArrayList<>();
        
        Animal perro = new perro("Firulais", "Jorkie", "Negro", 1);
        Animal gato = new Gato("Michi", "Cafe", "Angora", 2);
        Animal pajaro = new Pajaro("Piolin", "cafe");

        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
