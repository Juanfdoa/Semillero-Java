package main.java.com.softlond.project.registroAlumnos;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int edad;
    private ArrayList<Float> calificaciones;

    Alumno(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.calificaciones=new ArrayList<Float>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Float calificacion) {
        calificaciones.add(calificacion);
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", calificaciones=" + calificaciones + "]";
    }
    
}