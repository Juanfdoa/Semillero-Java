package main.java.com.softlond.exercises.tienda_linea.clases;

public class Electronica extends Producto{
    String marca;
    String generacion;

    public Electronica(String nombre, double precio, String marca, String generacion) {
        super(nombre, precio);
        this.marca = marca;
        this.generacion = generacion;
    }

    @Override
    public void mostarDetalle() {
        System.out.println("Producto electronico");
        System.out.println("Producto: " + this.nombre + ", Marca: " + this.marca + ", Generacion: " + this.generacion);
    }

    @Override
    public Double calcularPrecio() {
        return this.precio;
    }
    
}
