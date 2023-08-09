package main.java.com.softlond.project.reservaHotel;

public class Habitacion {
    private int numero;
    private String ocupante;

    public Habitacion(int numero) {
        this.numero = numero;
        this.ocupante = "";
    }

    public int getNumero() {
        return numero;
    }

    public String getOcupante() {
        return ocupante;
    }

    public void ocupar(String ocupante) {
        this.ocupante = ocupante;
    }

    public void desocupar() {
        this.ocupante = "";
    }
}

