package main.java.com.softlond.exercises.figuras_geometricas.clases;

import main.java.com.softlond.exercises.figuras_geometricas.interfaces.IFigura;

public class Figura implements IFigura{
    private String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
       
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public void calcularArea(){
        System.out.println("El area de la figura " + this.getNombre() + " es: " + this.getArea());
    }
}
