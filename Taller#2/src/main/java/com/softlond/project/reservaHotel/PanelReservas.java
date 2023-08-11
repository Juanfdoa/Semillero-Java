package main.java.com.softlond.project.reservaHotel;

import javax.swing.JOptionPane;

public class PanelReservas {
    
    public void run(){
        Habitacion h101 = new Habitacion(101, 100);
        Habitacion h102 = new Habitacion(102, 120);
        Habitacion h103 = new Habitacion(103, 140);

        Hotel hilton = new Hotel("Hilton");
        hilton.agregarHabitacion(h101);
        hilton.agregarHabitacion(h102);
        hilton.agregarHabitacion(h103);

        Habitacion r101 = new Habitacion(101, 100);
        Habitacion r102 = new Habitacion(102, 120);
        Habitacion r103 = new Habitacion(103, 140);

        Hotel royal = new Hotel("Royal");
        royal.agregarHabitacion(r101);
        royal.agregarHabitacion(r102);
        royal.agregarHabitacion(r103);

        menu(hilton, royal);
        
    }

    public void menu(Hotel hilton, Hotel royal){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las siguientes opciones: \n 1. Habitaciones disponibles \n 2. Realizar reserva \n 3. cancelar reserva \n 4. habitaciones reservadas \n 5. Salir"));
        switch (opcion) {
            case 1:
                int hotel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de hotel: \n 1. Hilton \n 2. Royal"));
                Hotel hotelSeleccionado = hotel == 1 ? hilton : royal;

                String habitacionesDisponibles = "Hotel: "+ hotelSeleccionado.getNombre() +"\n";
                for (int i = 0; i < hotelSeleccionado.getHabitaciones().size(); i++) {
                    System.out.println("Hotel: " + hotelSeleccionado.getNombre() + ", " + "Habitacion: " + hotelSeleccionado.getHabitaciones().get(i).getNumero() + ", " + "Precio: " +hotelSeleccionado.getHabitaciones().get(i).getPrecio() + ", " + "Disponible: " + hotelSeleccionado.getHabitaciones().get(i).isDisponible() + ", " + "Cliente: " + hotelSeleccionado.getHabitaciones().get(i).getCliente());
                    habitacionesDisponibles += "Habitacion: " + hotelSeleccionado.getHabitaciones().get(i).getNumero() + ", " + "Precio: " +hotelSeleccionado.getHabitaciones().get(i).getPrecio() + "\n";
                }
                JOptionPane.showMessageDialog(null, habitacionesDisponibles);
                menu(hilton, royal);
                break;
            case 2:
                int hotelReserva = Integer.parseInt(JOptionPane.showInputDialog("Realizar reserva \n Ingrese el número de hotel: \n 1. Hilton \n 2. Royal"));
                Hotel hotelSelected = hotelReserva == 1 ? hilton : royal;

                String habitaciones = "Hotel: "+ hotelSelected.getNombre() +"\n";
                for (int i = 0; i < hotelSelected.getHabitaciones().size(); i++) {
                    habitaciones += "Habitacion: " + hotelSelected.getHabitaciones().get(i).getNumero() + ", " + "Precio: " +hotelSelected.getHabitaciones().get(i).getPrecio() + "\n";
                }

                int habitacionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación: \n" + habitaciones));
                Habitacion habitacion = hotelSelected.getHabitacion(habitacionSeleccionada);

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
                String documento = JOptionPane.showInputDialog("Ingrese el documento del cliente: ");
                String empresa = JOptionPane.showInputDialog("Ingrese la empresa del cliente: ");
                habitacion.setCliente(empresa);
                habitacion.setDisponible(false);
                Cliente cliente = new Cliente(nombre, documento, empresa);

                Reserva reserva = new Reserva(cliente, habitacion);
                JOptionPane.showMessageDialog(null, "Reserva realizada con éxito. \nUsuario: \n" +   reserva.getCliente() + "\n" + "Habitacion: \n" + reserva.getHabitacion());
                menu(hilton, royal);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Cancelar reserva: \n A continuación ingrese el número de habitación que desea cancelar.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Habitaciones reservadas: \n A continuación se muestran las habitaciones reservadas.");
                int hotelR = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de hotel: \n 1. Hilton \n 2. Royal"));
                Hotel hotelSelectedRes = hotelR == 1 ? hilton : royal;

                String habitacionesReservadas = "Hotel: "+ hotelSelectedRes.getNombre() +"\n";
                if (hotelSelectedRes.getHabitacionesReservadas().size() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay habitaciones reservadas.");
                    menu(hilton, royal);
                }else{
                    for (int i = 0; i < hotelSelectedRes.getHabitacionesReservadas().size(); i++) {;
                        habitacionesReservadas += "Habitaciones reservadas: \nNumero: " + hotelSelectedRes.getHabitacionesReservadas().get(i).getNumero() + "\nPrecio: " + "Precio: " + hotelSelectedRes.getHabitacionesReservadas().get(i).getPrecio() + "\nCliente: " + hotelSelectedRes.getHabitacionesReservadas().get(i).getCliente() + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, habitacionesReservadas);
                menu(hilton, royal);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Salir: \n Gracias por usar el sistema de reservas de hoteles.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }

}
