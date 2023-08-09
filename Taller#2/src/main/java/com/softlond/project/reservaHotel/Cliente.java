package main.java.com.softlond.project.reservaHotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Cliente {
    private String nombreEmpresa;
    private Map<Hotel, ArrayList<Habitacion>> reservas;

    public Cliente(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.reservas = new HashMap<>();
    }

    public String getNombre() {
        return nombreEmpresa;
    }

    public void agregarReserva(Hotel hotel, Habitacion habitacion) {
        if (!reservas.containsKey(hotel)) {
            reservas.put(hotel, new ArrayList<>());
        }
        reservas.get(hotel).add(habitacion);
    }

    public void eliminarReserva(Hotel hotel, Habitacion habitacion) {
        if (reservas.containsKey(hotel)) {
            reservas.get(hotel).remove(habitacion);
            if (reservas.get(hotel).isEmpty()) {
                reservas.remove(hotel);
            }
        }
    }
    
    public void mostrarInfoReservas() {
        JOptionPane.showMessageDialog(null, "Empresa: " + nombreEmpresa);
        for (Hotel hotel : reservas.keySet()) {
            JOptionPane.showMessageDialog(null, "Hotel: " + hotel.getNombre());
            for (Habitacion habitacion : reservas.get(hotel)) {
                JOptionPane.showMessageDialog(null, "Habitación " + habitacion.getNumero() + " - Ocupante: " + habitacion.getOcupante());
            }
        }
    }
}

