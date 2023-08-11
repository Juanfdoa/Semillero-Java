import javax.swing.JOptionPane;

import main.java.com.softlond.project.calculadora.Calculadora;
import main.java.com.softlond.project.conversorMoneda.Conversor;
import main.java.com.softlond.project.registroAlumnos.SistemaAlumno;
import main.java.com.softlond.project.reservaHotel.PanelReservas;

public class App {
    public static void main(String[] args) throws Exception {
        
        String input = JOptionPane.showInputDialog("Ingrese una de las siguientes opciones: \n 1. Registrar Alumnos \n 2. Conversor Moneda \n 3. Calculadora \n 4. Reserva Hotel ");
        int opcion = Integer.parseInt(input);

        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Registrar Alumnos: \n A continuación ingrese el nombre, la edad del alumno y sigue con las instrucciones.");
                SistemaAlumno sistemaAlumno = new SistemaAlumno();
                sistemaAlumno.run();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Conversor Moneda: \n A continuación ingrese la moneda inicial, la cantidad a convertir y la moneda final.");
                Conversor conversor = new Conversor();
                conversor.run();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Calculadora:  A continuación ingrese los números y la operación que desea realizar.");
                Calculadora calculadora = new Calculadora();
                calculadora.run();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Reserva Hotel:\n Bienvenido al sistema de reservas de hoteles.");
                PanelReservas panelReservas = new PanelReservas();
                panelReservas.run();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.");
                break;
        }
    }
}
