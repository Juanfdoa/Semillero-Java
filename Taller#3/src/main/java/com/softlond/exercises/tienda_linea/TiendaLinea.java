package main.java.com.softlond.exercises.tienda_linea;

import main.java.com.softlond.exercises.tienda_linea.clases.Electronica;
import main.java.com.softlond.exercises.tienda_linea.clases.Libro;
import main.java.com.softlond.exercises.tienda_linea.clases.Producto;
import main.java.com.softlond.exercises.tienda_linea.clases.Ropa;

public class TiendaLinea {
    public void run(){
        System.out.println("Tienda en linea \n");
        Producto producto1 = new Electronica("Smartphone", 1200000, "Samsung", "5G");
        Producto producto2 = new Ropa("Camisa", 50000, "M", "Azul");
        Producto producto3 = new Libro("The lord of the rings", 130000, "J.R.R Tolkien", "Fantasia");
       
        Producto[] productos = {producto1, producto2, producto3};
        for (Producto producto : productos) {
            producto.mostarDetalle();
            System.out.println("Precio: " + producto.calcularPrecio() + "\n");
            System.out.println("---------------Salto de linea ------------");
        }
    }
}
