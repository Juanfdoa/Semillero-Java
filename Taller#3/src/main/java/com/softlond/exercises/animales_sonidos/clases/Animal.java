package main.java.com.softlond.exercises.animales_sonidos.clases;

public class Animal {
    protected String nombre;
    protected String color;
    protected String tipo;

    public Animal(String nombre, String color, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
    }
        
    public void hacerSonido(){};
}
