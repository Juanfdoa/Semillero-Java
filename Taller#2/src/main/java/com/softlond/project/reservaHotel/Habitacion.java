package main.java.com.softlond.project.reservaHotel;

public class Habitacion {
    private int numero;
    private double precio;
    private boolean disponible;
    private String cliente;

    public Habitacion(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
        this.disponible = true;
        this.cliente = null;
    }
       
    public int getNumero() {
        return numero;
    }

    public String getInformacion() {
        return "Numero: " + numero + ", Precio: " + precio;
    }

    public int getHabitacion(int numero) {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String nombre) {
        this.cliente = nombre;
    }

    public void setDisponible(boolean estado) {
        this.disponible = estado;
    }
}

