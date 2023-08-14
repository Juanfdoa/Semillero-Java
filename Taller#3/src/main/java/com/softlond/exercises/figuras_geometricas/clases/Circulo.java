package main.java.com.softlond.exercises.figuras_geometricas.clases;

public class Circulo extends Figura {
    private double radio;
    private double pi;


    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
        this.pi = 3.1416;
    }

    public double getRadio() {
        return radio;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double getArea() {
        Double area = pi * (radio * radio);
        return area;
    } 

    @Override
    public double getPerimetro() {
        Double perimetro = 2 * pi * radio;
        return perimetro;
    }

    @Override
    public void calcularArea(){
        System.out.println("Soy un circulo y esta es mi area: " + this.getArea());
    }
}
