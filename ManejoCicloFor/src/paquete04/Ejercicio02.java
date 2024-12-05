/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        int contador = 0;
        double celcius = 0;
        double operacion = 0;
        String cadena = "";
        
        for (double i = 20; i <= 100; i+=4) {
            operacion = ((5.00/9.00)*(i-32.00));
            celcius = operacion;
            
            cadena = String.format("%sOperacion(%d) Fahrenheit: %.2f ===> "
                    + "Celcius: %.2f\n",
                    cadena,
                    contador,
                    i,
                    celcius);
            contador = contador + 1;
        }
        System.out.printf("%s\n",
                cadena);
    }
    
}
