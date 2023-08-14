package main.java.com.softlond.exercises.figuras_geometricas;

import main.java.com.softlond.exercises.figuras_geometricas.clases.Circulo;
import main.java.com.softlond.exercises.figuras_geometricas.clases.Cuadrado;
import main.java.com.softlond.exercises.figuras_geometricas.clases.Figura;
import main.java.com.softlond.exercises.figuras_geometricas.clases.Triangulo;

public class FigurasGeometricas {
    
    public void run(){
        System.out.println("Figuras geométricas");
        
        Figura circulo = new Circulo("Circulo", 10);
        circulo.getArea();
        circulo.getPerimetro();
        System.out.println("El área del " + circulo.getNombre() + " es: " + circulo.getArea());
        System.out.println("El perímetro del " + circulo.getNombre() + " es: " + circulo.getPerimetro());

        Figura triangulo = new Triangulo("Triangulo", 12, 15, 20,20,20);
        triangulo.getArea();
        triangulo.getPerimetro();
        System.out.println("El área del " + triangulo.getNombre() + " es: " + triangulo.getArea());
        System.out.println("El perímetro del " + triangulo.getNombre() + " es: " + triangulo.getPerimetro());

        Figura cuadrado = new Cuadrado("Cuadrado", 10);
        cuadrado.getArea();
        cuadrado.getPerimetro();
        System.out.println("El área del " + cuadrado.getNombre() + " es: " + cuadrado.getArea());
        System.out.println("El perímetro del " + cuadrado.getNombre() + " es: " + cuadrado.getPerimetro());
    }
}
