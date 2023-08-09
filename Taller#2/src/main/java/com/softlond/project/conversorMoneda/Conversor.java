package main.java.com.softlond.project.conversorMoneda;

import javax.swing.JOptionPane;

public class Conversor {
    public void run() {
        String monedaIn = JOptionPane.showInputDialog("Ingrese la moneda inicial: \n 1. Euro \n 2. Dollar \n 3. Peso  ");
        int monedaInicial = Integer.parseInt(monedaIn);

        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad a convertir: ");
        float cantidadConvertir = Float.parseFloat(cantidad);

        String monedaFi = JOptionPane.showInputDialog("Ingrese la moneda final: \n 1. Euro \n 2. Dollar \n 3. Peso ");
        int monedaFinal = Integer.parseInt(monedaFi);

        OperacionMoneda operacionMoneda = new OperacionMoneda();

        if (monedaInicial == 1 && monedaFinal == 2) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + operacionMoneda.euroDollar(cantidadConvertir) + " USD");
        } else if (monedaInicial == 1 && monedaFinal == 3) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + operacionMoneda.euroPeso(cantidadConvertir) + " COP");
        } else if (monedaInicial == 2 && monedaFinal == 1) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + operacionMoneda.dollarEuro(cantidadConvertir) + " EUR");
        } else if (monedaInicial == 2 && monedaFinal == 3) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + operacionMoneda.dollarPeso(cantidadConvertir) + " COP");
        } else if (monedaInicial == 3 && monedaFinal == 1) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + operacionMoneda.pesoEuro(cantidadConvertir) + " EUR");
        } else if (monedaInicial == 3 && monedaFinal == 2) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + operacionMoneda.pesoDollar(cantidadConvertir) + " USD");
        } else if (monedaInicial == 1 && monedaFinal == 1) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + cantidadConvertir + " EUR");
        } else if (monedaInicial == 2 && monedaFinal == 2) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + cantidadConvertir + " USD");
        } else if (monedaInicial == 3 && monedaFinal == 3) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + cantidadConvertir + " COP");
        } else {
            JOptionPane.showMessageDialog(null, "Operación no válida.");
        }
            
    }
}
