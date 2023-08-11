package main.java.com.softlond.project.reservaHotel;

public class Cliente {
    private String nombre;
    private String documento;
    private String empresa;

    public Cliente(String nombre, String documento, String empresa) {
        this.nombre = nombre;
        this.documento = documento;
        this.empresa = empresa;
    }

    public String getCliente() {
        return empresa;
    }

    public String getInformacion() {
        return "Nombre: "+ nombre + "\nDocumento: " + documento + "\nEmpresa: " + empresa;
    }
}

