package main.java.com.softlond.exercises.animales_sonidos.clases;

public class Terrestres extends Animal {
    
    public Terrestres(String nombre, String color) {
        super(nombre, color, "Terrestre");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un animal terrestre y hago un sonido");
    }
    
}
