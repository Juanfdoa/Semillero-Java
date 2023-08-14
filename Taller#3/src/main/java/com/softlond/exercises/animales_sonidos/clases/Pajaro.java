package main.java.com.softlond.exercises.animales_sonidos.clases;

public class Pajaro extends Aviadores {

    public Pajaro(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Soy un pajaro y hago Pio pio");
    }
    
}
