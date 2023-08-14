package main.java.com.softlond.exercises.animales_sonidos.clases;

public class Aviadores extends Animal {

    public Aviadores(String nombre, String color) {
        super(nombre, color, "Aviadores");
        
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Soy un animal aviador y hago un sonido");
    }
}
