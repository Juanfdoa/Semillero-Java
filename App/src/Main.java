import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        ejercicio35();
    }

    //Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división
    public static void ejercicio1() {
        String num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        int num1Int = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        int num2Int = Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, "La suma es: " + (num1Int + num2Int) +
        "\nLa resta es: " + (num1Int - num2Int) + "" +
        "\nLa multiplicación es: " + (num1Int * num2Int) + "" +
        "\nLa división es: " + (num1Int / num2Int) + "");
    }

     //Escribe un programa que pida al usuario un número entero y determine si es par o impar
    public static void ejercicio2(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numInt = Integer.parseInt(num);

        if(numInt % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "El número es par");
        }else{
            JOptionPane.showMessageDialog(null, "El número es impar");
        }
    }

    //Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.
    public static void ejercicio3(){
        String radio = JOptionPane.showInputDialog("Ingrese el radio del circulo: ");
        Float radioFloat = Float.parseFloat(radio);
        Float pi = (float) 3.1416;

        Float area = pi * (radioFloat * radioFloat);
        Float perimetro = 2 * pi * radioFloat;

        JOptionPane.showMessageDialog(null, "El área del circulo es: " + area + "\nEl perímetro del circulo es: " + perimetro);
    }

    //Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad
    public static void ejercicio4(){
        String edad = JOptionPane.showInputDialog("Ingrese su edad: ");
        int edadInt = Integer.parseInt(edad);

        if(edadInt >= 18){
            JOptionPane.showMessageDialog(null, "Es mayor de edad");
        }else{
            JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
    }

    //Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
    public static void ejercicio5(){
        String num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        int num1Int = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        int num2Int = Integer.parseInt(num2);

        if(num1Int > num2Int){
            JOptionPane.showMessageDialog(null, "El número mayor es: " + num1Int);
        }else{
            JOptionPane.showMessageDialog(null, "El número mayor es: " + num2Int);
        }
    }

    //Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.
    public static void ejercicio6(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numInt = Integer.parseInt(num);

        if(numInt > 0){
            JOptionPane.showMessageDialog(null, "El número es positivo");
        }else if(numInt < 0){
            JOptionPane.showMessageDialog(null, "El número es negativo");
        }else{
            JOptionPane.showMessageDialog(null, "El número es cero");
        }
    }

    //Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.
    public static void ejercicio7(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero positivo: ");
        int numInt = Integer.parseInt(num);

        for(int i = 1; i <= 10; i++){
            JOptionPane.showMessageDialog(null, numInt + " x " + i + " = " + (numInt * i));
        }
    }

    //Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. 
    //El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar
    public static void ejercicio8(){
        int numAleatorio = (int) (Math.random() *100) + 1;  
        String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numInt = Integer.parseInt(num);
        int intentos = 0;

        while (numInt != numAleatorio) {
            intentos++;
            if(numInt > numAleatorio){
                JOptionPane.showMessageDialog(null, "El número es menor");
            }else{
                JOptionPane.showMessageDialog(null, "El número es mayor");
            }
            num = JOptionPane.showInputDialog("Ingrese un número entero: ");
            numInt = Integer.parseInt(num);
        }
        JOptionPane.showMessageDialog(null, "Felicidades! Adivinaste el número " + "\nNúmero: " + numAleatorio + "\nIntentos: " + intentos);
      
    }

    //Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
    public static void ejercicio9(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero positivo: ");
        int numInt = Integer.parseInt(num);
        int factorial = 1;

        for(int i = 1; i <= numInt; i++){
            factorial = factorial * i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numInt + " es: " + factorial);
    }

    //Crea un programa que muestre los primeros 20 números de la serie Fibonacci. 
    //La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
    public static void ejercicio10(){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        String serie = "0, 1";

        for(int i = 0; i < 18; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            serie = serie + ", " + num3;
        }
        JOptionPane.showMessageDialog(null, "La serie Fibonacci es: " + serie);
    }

    //Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.
    public static void ejercicio11(){
        String a = JOptionPane.showInputDialog("Ingrese el valor para el lado A del triángulo: ");
        Float aFloat = Float.parseFloat(a);
        String b = JOptionPane.showInputDialog("Ingrese el valor para el lado B del triángulo: ");
        Float bFloat = Float.parseFloat(b);
        String c = JOptionPane.showInputDialog("Ingrese el valor para el lado C del triángulo: ");
        Float cFloat = Float.parseFloat(c);

        Float s = (aFloat + bFloat + cFloat) / 2;
        Float area = (float) Math.sqrt(s * (s - aFloat) * (s - bFloat) * (s - cFloat));

        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
    }

    //Realiza un programa que pida al usuario un número entero y determine si es un número primo o no
    public static void ejercicio12(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numInt = Integer.parseInt(num);
        int contador = 0;

        for(int i = 1; i <= numInt; i++){
            if(numInt % i == 0){
                contador++;
            }
        }
        if(contador == 2){
            JOptionPane.showMessageDialog(null, "El número " + numInt + " es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El número " + numInt + " no es primo");
        }
    }

    //Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales 
    public static void ejercicio13(){
        String num = JOptionPane.showInputDialog("Ingrese un número decimal: ");
        Float numFloat = Float.parseFloat(num);
        String decimales = JOptionPane.showInputDialog("Ingrese la cantidad de decimales: ");
        int decimalesInt = Integer.parseInt(decimales);

        String numString = String.format("%." + decimalesInt + "f", numFloat);
        JOptionPane.showMessageDialog(null, "El número redondeado es: " + numString);
    }

    //Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. 
    //Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.
    public static void ejercicio14(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero positivo: ");
        int numInt = Integer.parseInt(num);
        int suma = 0;

        for(int i = 1; i < numInt; i++){
            if(numInt % i == 0){
                suma = suma + i;
            }
        }
        if(suma == numInt){
            JOptionPane.showMessageDialog(null, "El número " + numInt + " es perfecto");
        }else{
            JOptionPane.showMessageDialog(null, "El número " + numInt + " no es perfecto");
        }

        JOptionPane.showMessageDialog(null, 10  % 2 );
    }

    //Crea un programa que pida al usuario un número entero y determine si es un número capicúa. 
    //Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.
    public static void ejercicio15(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero: "); 
        int numInt = Integer.parseInt(num); 
        int numInvertido = 0;  
        int numAux = numInt;  

        while(numAux != 0){
            numInvertido = numInvertido * 10 + numAux % 10;
            numAux = numAux / 10;
        }
        if(numInt == numInvertido){
            JOptionPane.showMessageDialog(null, "El número " + numInt + " es capicúa");
        }else{
            JOptionPane.showMessageDialog(null, "El número " + numInt + " no es capicúa");
        }
    }

    //Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario
    public static void ejercicio16(){
        String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numInt = Integer.parseInt(num);
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        String serie = "0, 1";

        while(num3 < numInt){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            serie = serie + ", " + num3;
        }
        JOptionPane.showMessageDialog(null, "La serie Fibonacci es: " + serie);
    }
    
    //Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
    public static void ejercicio17(){
        String num1 = JOptionPane.showInputDialog("Ingrese el primer número entero: ");
        int num1Int = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número entero: ");
        int num2Int = Integer.parseInt(num2);

        String primos = "";

        for(int i = num1Int; i <= num2Int; i++){
            int contador = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    contador++;
                }
            }
            if(contador == 2){
                primos = primos + i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, "Los números primos entre " + num1Int + " y " + num2Int + " son: " + primos);
    }

    //Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. 
    //Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.
    public static void ejercicio18(){
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteres = mayusculas + minusculas + numeros;
        String contrasena = "";

        for(int i = 0; i < 8; i++){
            int num = (int) (Math.random() * caracteres.length());
            contrasena = contrasena + caracteres.charAt(num);
        }
        JOptionPane.showMessageDialog(null, "La contraseña generada es: " + contrasena);
    }

    //Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas 
    public static void ejercicio19(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String nombreMayus = nombre.toUpperCase();
        String nombreMinus = nombre.toLowerCase();

        JOptionPane.showMessageDialog(null, "Su nombre en mayúsculas es: " + nombreMayus + "\nSu nombre en minúsculas es: " + nombreMinus);
    }

    //Realiza un programa que solicite al usuario una cadena y luego invierta su orden 
    public static void ejercicio20(){
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");  
        String cadenaInvertida = "";

        for(int i = cadena.length() - 1; i >= 0; i--){
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "La cadena invertida es: " + cadenaInvertida);
    }

    //Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella
    public static void ejercicio21(){
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        String letra = JOptionPane.showInputDialog("Ingrese una letra: ");
        int contador = 0;

        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == letra.charAt(0)){
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "La letra " + letra + " aparece " + contador + " veces en la cadena");
    }

    //Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) 
    public static void ejercicio22(){
        String frase = JOptionPane.showInputDialog("Ingrese una frase: ");

        String fraseInvertida = "";

        for(int i = frase.length() - 1; i >= 0; i--){
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }

        String fraseSinEspacios = frase.replaceAll(" ", "");
        String fraseInvertidaSinEspacios = fraseInvertida.replaceAll(" ", "");

        if (fraseSinEspacios.toLowerCase().equals(fraseInvertidaSinEspacios.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "La frase es palíndromo");
        } else {
            JOptionPane.showMessageDialog(null, "La frase no es palíndromo");
        }
            
    }

    //Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
    public static void ejercicio23(){
        String oracion = JOptionPane.showInputDialog("Ingrese una oracion: ");
        String[] palabras = oracion.split(" ");
        JOptionPane.showMessageDialog(null,"La oracion: "+ oracion +", Contiene: " + palabras.length + " palabras");
    }

    //Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
    public static void ejercicio24(){
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        String letraA = JOptionPane.showInputDialog("Ingrese la letra que sera reemplazada: ");
        String letraB = JOptionPane.showInputDialog("Ingrese la nueva letra: ");

        String cadenaReemplazada = cadena.replace(letraA, letraB);
        JOptionPane.showMessageDialog(null, "La cadena reemplazada es: " + cadenaReemplazada);
    }
    //Pide al usuario una frase y muestra cada palabra por separado 
    public static void ejercicio25(){
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        
        String[] letras = cadena.split("");
        String cadenaSeparada = "";

        for (int i = 0; i < letras.length; i++) {
            cadenaSeparada = cadenaSeparada + letras[i] + "-";
        }

        JOptionPane.showMessageDialog(null, cadenaSeparada);
    }

    //Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco 
    public static void ejercicio26(){
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        String[] letras = cadena.split("");
        Integer contador = 0;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(" ")) {
                
            }else{
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "La cadena tiene " + contador + " letras");
    }

    //Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
    public static void ejercicio27(){
        String frase = JOptionPane.showInputDialog("Ingrese una frase: ");
        String[] palabras = frase.split(" ");
        Arrays.sort(palabras);
        String cadenaOrdenada = "";

        for (int i = 0; i < palabras.length; i++) {
            cadenaOrdenada = cadenaOrdenada + palabras[i] + ", ";
        }

        JOptionPane.showMessageDialog(null, "La cadena ordenada es: " + cadenaOrdenada);
    }

    //Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
    public static void ejercicio28(){
        int numeros[] = {10,15,33,24,55,5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + suma);
    }

    public static void ejercicio29(){
        int numeros[] = {10,15,33,24,55,5};
        int mayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El numero mayor del arreglo es: " + mayor);
    }

    //Diseña un programa que elimine los elementos duplicados de un arreglo.
    public static void ejercicio30(){
        int numeros[] = {10,15,33,24,55,5,10,15,33,24,55,5};
        int numerosSinRepetir[] = new int[numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean existe = false;
            for (int j = 0; j < numerosSinRepetir.length; j++) {
                if (numeros[i] == numerosSinRepetir[j]) {
                    existe = true;
                }
            }
            if (!existe) {
                numerosSinRepetir[contador] = numeros[i];
                contador++;
            }
        }

        String cadena = "";
        for (int i = 0; i < numerosSinRepetir.length; i++) {
            if (numerosSinRepetir[i] != 0) {
                cadena = cadena + numerosSinRepetir[i] + ", ";
            }
        }

        JOptionPane.showMessageDialog(null, "El arreglo sin repetir es: " + cadena);
    }

    //Ordenar elementos: Implementa un algoritmo de ordenamiento 
    //(por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.
    public static void ejercicio31(){
        int numeros[] = {10,15,33,24,55,5};
        int auxiliar = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        String cadena = "";
        for (int i = 0; i < numeros.length; i++) {
            cadena = cadena + numeros[i] + ", ";
        }

        JOptionPane.showMessageDialog(null, "El arreglo ordenado es: " + cadena);
    }

    //Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).
    public static void ejercicio32(){
        int numeros[] = {10,15,33,24,55,5};
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                indice = i;
            }
        }

        if (indice == -1) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero " + numero + " se encuentra en el indice " + indice);
        }
    }

    //Escribe un programa que cuente la frecuencia de cada elemento en un arreglo
    public static void ejercicio33(){
        
           
    }


    //Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones
    public static void ejercicio34(){
        int numeros[] = {10,15,33,24,55,5};
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones: "));
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion (izquierda o derecha): ");
        int auxiliar = 0;

        if (direccion.equals("izquierda")) {
            for (int i = 0; i < cantidad; i++) {
                auxiliar = numeros[0];
                for (int j = 0; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
                numeros[numeros.length - 1] = auxiliar;
            }
        }else{
            for (int i = 0; i < cantidad; i++) {
                auxiliar = numeros[numeros.length - 1];
                for (int j = numeros.length - 1; j > 0; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[0] = auxiliar;
            }
        }

        String cadena = "";
        for (int i = 0; i < numeros.length; i++) {
            cadena = cadena + numeros[i] + ", ";
        }

        JOptionPane.showMessageDialog(null, "El arreglo rotado es: " + cadena);
    }

    //Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10. Usa para esto una matriz
    public static void ejercicio35(){
        int tabla[][] = new int[10][10];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        String cadena = "";
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                cadena = cadena + (i + 1) + "x" + (j + 1) + "=" + tabla[i][j] + "\n";
            }
            cadena = cadena + "\n";
        }

        System.out.println( "La tabla de multiplicar es: \n" + cadena);
    }
}
