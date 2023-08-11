package main.java.com.softlond.project.reservaHotel;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }
        
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Habitacion> habitacionesTotales() {
        ArrayList<Habitacion> habitacionesTotales = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() != 0) {
                habitacionesTotales.add(habitacion);
            }
        }
        return habitacionesTotales;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                habitacionesDisponibles.add(habitacion);
            }
        }
        return habitacionesDisponibles;
    }

    public Habitacion getHabitacion(int numero) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getNumero() == numero) {
                return habitaciones.get(i);
            }
        }
        return null;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public ArrayList<Habitacion> getHabitacionesReservadas() {
        ArrayList<Habitacion> habitacionesReservadas= new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible() == false) {
                habitacionesReservadas.add(habitacion);
            }
        }
        return habitacionesReservadas;
    }
}


    
