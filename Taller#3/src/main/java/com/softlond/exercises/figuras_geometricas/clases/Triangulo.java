package main.java.com.softlond.exercises.figuras_geometricas.clases;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(String nombre, double base, double altura, double lado1, double lado2, double lado3) {
        super(nombre);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        Double area = (base * altura) / 2;
        return area;
    }

    @Override
    public double getPerimetro() {
        Double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Soy un triangulo y esta es mi area: " + this.getArea());
    }
}
