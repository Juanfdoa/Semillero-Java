package main.java.com.softlond.exercises.tienda_linea.clases;

import main.java.com.softlond.exercises.tienda_linea.interfaces.ITienda;

public abstract class Producto implements ITienda{
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
