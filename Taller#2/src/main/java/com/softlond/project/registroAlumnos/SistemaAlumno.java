package main.java.com.softlond.project.registroAlumnos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SistemaAlumno {
    private ArrayList<Alumno> listaAlumnos;

    public SistemaAlumno() {
        listaAlumnos = new ArrayList<Alumno>();
    }

    public void run(){
        agregarAlumno();
    }


    public void agregarAlumno(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno"));

        Alumno alumno1 = new Alumno(nombre, edad);
        listaAlumnos.add(alumno1);
        JOptionPane.showMessageDialog(null, "Alumno registrado con éxito.\n "  + alumno1.getNombre() + "\n " + alumno1.getEdad());
    
        int respuesta = 1;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar una calificacion: \n 1. Si \n 2. No"));

            if (opcion == 1) {
                float calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación"));
                asignarCalificaciones(alumno1, calificacion);
            } else if (opcion == 2) {
                respuesta = 2;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (respuesta != 2);

        JOptionPane.showMessageDialog(null,alumno1.toString());
        
        int promedio = Integer.parseInt(JOptionPane.showInputDialog("Desea calcular el promedio: \n 1. Si \n 2. No"));
        if (promedio == 1) {
            calcularPromedio(alumno1);
        } else if (promedio == 2) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
     
    }

    public void asignarCalificaciones(Alumno alumno,Float calificacion){
        alumno.setCalificaciones(calificacion);
    }

    public void calcularPromedio(Alumno alumno){
        Float promedio=0F;
        ArrayList<Float> calificacioneslista=new ArrayList<Float>();
        calificacioneslista= alumno.getCalificaciones();
        for (int i = 0; i < calificacioneslista.size(); i++) {
            promedio=promedio+calificacioneslista.get(i);
        }
        promedio=promedio/calificacioneslista.size();
        JOptionPane.showMessageDialog(null, "El promedio de: "+ alumno.getNombre()+" es: "+promedio);
    }
}
