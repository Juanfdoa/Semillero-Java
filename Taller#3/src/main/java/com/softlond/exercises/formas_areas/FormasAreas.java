package main.java.com.softlond.exercises.formas_areas;

import java.util.ArrayList;
import java.util.List;

import main.java.com.softlond.exercises.figuras_geometricas.clases.Circulo;
import main.java.com.softlond.exercises.figuras_geometricas.clases.Cuadrado;
import main.java.com.softlond.exercises.figuras_geometricas.clases.Figura;
import main.java.com.softlond.exercises.figuras_geometricas.clases.Triangulo;

public class FormasAreas {
    public void run(){
        System.out.println("Formas geometricas y Areas");

        List<Figura> figuras = new ArrayList<>();
        Figura circulo = new Circulo("Circulo", 5);
        Figura cuadrado = new Cuadrado("Cuadrado", 10);
        Figura triangulo = new Triangulo("Triangulo", 20, 12, 20, 20, 20);

        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(triangulo);

        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }
}
