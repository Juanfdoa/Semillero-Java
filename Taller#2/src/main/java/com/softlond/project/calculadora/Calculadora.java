package main.java.com.softlond.project.calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public void run() {
        String num1 = JOptionPane.showInputDialog("Ingresa el numero 1");
        float a = Float.parseFloat(num1);

        String num2 = JOptionPane.showInputDialog("Ingresa el numero 2");
        float b = Float.parseFloat(num2);

        String signo = JOptionPane.showInputDialog("Ingrese una de las siguientes opciones: \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir ");
        int operacion = Integer.parseInt(signo);

        Operaciones operaciones = new Operaciones();

        switch (operacion) {
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + operaciones.sumar(a, b));  
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + operaciones.restar(a, b));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + operaciones.multiplicar(a, b));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + operaciones.dividir(a, b));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.");
                break;
        }
    }
    

}
