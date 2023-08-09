package main.java.com.softlond.project.reservaHotel;

import javax.swing.JOptionPane;

public class Reserva {
    
    public void run() {
        Hotel hotel1 = new Hotel("Mayor Plaza", 10);
        Hotel hotel2 = new Hotel("Hilton", 8);

        Cliente cliente = new Cliente("Team International");

        int input = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción del menú. \n 1. Listar habitaciones disponibles \n 2. Reservar habitación \n 3. Cancelar reserva \n 4. Mostrar info de reservas \n 5. Salir "));

        int opcion = input;
        do {
    
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Habitaciones disponibles en " + hotel1.getNombre() + ": " + hotel1.getHabitacionesDisponibles().size());
                    JOptionPane.showMessageDialog(null, "Habitaciones disponibles en " + hotel2.getNombre() + ": " + hotel2.getHabitacionesDisponibles().size());
                    run();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Ingrese el número de habitación: ");
                    int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación: "));

                    if (hotel1.reservarHabitacion(cliente, numeroHabitacion) || hotel2.reservarHabitacion(cliente, numeroHabitacion)) {
                        System.out.println("Habitación " + numeroHabitacion + " reservada exitosamente.");
                    } else {
                        System.out.println("La habitación no está disponible o no existe.");
                    }
                    run();
                    break;
                case 3:
                    int numeroHabitacionCancelar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación a cancelar: "));
                    
                    hotel1.cancelarReserva(cliente, numeroHabitacionCancelar);
                    hotel2.cancelarReserva(cliente, numeroHabitacionCancelar);

                   JOptionPane.showMessageDialog(null, "Reserva de habitación " + numeroHabitacionCancelar + " cancelada exitosamente.");
                   run(); 
                   break;
                case 4:
                    cliente.mostrarInfoReservas();
                    run();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de reservas de hoteles.");
                    run();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 5);

    }
}
