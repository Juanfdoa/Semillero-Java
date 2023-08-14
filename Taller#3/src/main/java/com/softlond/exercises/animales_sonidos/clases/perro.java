package main.java.com.softlond.exercises.animales_sonidos.clases;

public class perro extends Terrestres{
    protected String raza;
    protected int edad;

    public perro(String nombre, String raza, String color, int edad) {
        super(nombre, color);
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y hago guau guau");
    }
}
