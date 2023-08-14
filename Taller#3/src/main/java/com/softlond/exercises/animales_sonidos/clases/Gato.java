package main.java.com.softlond.exercises.animales_sonidos.clases;

public class Gato extends Terrestres {
    protected String raza;
    protected int edad;

    public Gato(String nombre, String color, String raza, int edad) {
        super(nombre, color);
        this.raza = raza;
        this.edad = edad;
    }
    
    public void hacerSonido(){
        System.out.println("Soy un gato y hago miau");
    }
}
