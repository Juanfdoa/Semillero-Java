package main.java.com.softlond.exercises.tienda_linea.clases;

public class Ropa extends Producto {
    private String talla;
    private String color;

    public Ropa(String nombre, double precio, String talla, String color) {
        super(nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    @Override
    public void mostarDetalle() {
        System.out.println("Ropa");
        System.out.println("Producto: " + this.nombre + ", Talla: " + this.talla + ", Color: " + this.color);
    }

    @Override
    public Double calcularPrecio() {
        return precio;
    }
    
}
