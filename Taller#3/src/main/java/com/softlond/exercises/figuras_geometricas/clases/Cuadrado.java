package main.java.com.softlond.exercises.figuras_geometricas.clases;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double getArea() {
        Double area = lado * lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        Double perimetro = lado * 4;
        return perimetro;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Soy un cuadrado y esta es mi area: " + this.getArea());
    }
}
