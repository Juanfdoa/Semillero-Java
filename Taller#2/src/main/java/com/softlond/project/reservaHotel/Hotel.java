package main.java.com.softlond.project.reservaHotel;

import java.util.ArrayList;

public class Hotel {
        private String nombre;
        private ArrayList<Habitacion> habitaciones;
    
        public Hotel(String nombre, int numHabitaciones) {
            this.nombre = nombre;
            this.habitaciones = new ArrayList<>();
            for (int i = 1; i <= numHabitaciones; i++) {
                habitaciones.add(new Habitacion(i));
            }
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public ArrayList<Habitacion> getHabitacionesDisponibles() {
            ArrayList<Habitacion> disponibles = new ArrayList<>();
            for (Habitacion habitacion : habitaciones) {
                if (habitacion.getOcupante().isEmpty()) {
                    disponibles.add(habitacion);
                }
            }
            return disponibles;
        }
    
        public boolean reservarHabitacion(Cliente cliente, int numeroHabitacion) {
            Habitacion habitacion = obtenerHabitacion(numeroHabitacion);
            if (habitacion != null && habitacion.getOcupante().isEmpty()) {
                habitacion.ocupar(cliente.getNombre());
                cliente.agregarReserva(this, habitacion);
                return true;
            }
            return false;
        }
    
        public void cancelarReserva(Cliente cliente, int numeroHabitacion) {
            Habitacion habitacion = obtenerHabitacion(numeroHabitacion);
            if (habitacion != null && habitacion.getOcupante().equals(cliente.getNombre())) {
                habitacion.desocupar();
                cliente.eliminarReserva(this, habitacion);
            }
        }
    
        private Habitacion obtenerHabitacion(int numeroHabitacion) {
            for (Habitacion habitacion : habitaciones) {
                if (habitacion.getNumero() == numeroHabitacion) {
                    return habitacion;
                }
            }
            return null;
        }
}
    
