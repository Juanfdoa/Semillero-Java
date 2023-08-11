package main.java.com.softlond.project.reservaHotel;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
    }
       
    public String getCliente() {
        return cliente.getInformacion();
    }

    public String getHabitacion() {
        return habitacion.getInformacion();
    }

}
