package main.java.com.softlond.exercises.tienda_linea.clases;

public class Libro extends Producto {
    private String autor;
    private String editorial;

    public Libro(String nombre, double precio, String autor, String editorial) {
        super(nombre, precio);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void mostarDetalle() {
        System.out.println("Libreria");
        System.out.println("Producto: " + this.nombre + ", Autor: " + this.autor + ", Editorial: " + this.editorial);
    }

    @Override
    public Double calcularPrecio() {
       return precio;
    }
    
}
