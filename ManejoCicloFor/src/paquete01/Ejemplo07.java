/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        int suma;
        String mensajeFinal2 = "";
        String mensajeFinal = "";
        String cadenaFinal = "";
        for (int i = 1; i <= 10; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            mensajeFinal = String.format("%sTabla de multiplicar del número %d\n", 
                    mensajeFinal, i);
            mensajeFinal2 = String.format("%sTabla de sumar del numero %d\n",
                    mensajeFinal2, i);
            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                suma = i + contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal = String.format("%s%d x %d = %d\n", 
                        mensajeFinal, i, contador, operacion);
                mensajeFinal2 = String.format("%s%d + %d = %d\n",
                        mensajeFinal2, i, contador, suma);
            }
            // System.out.println("\n");
            cadenaFinal = String.format("%s%s\n", mensajeFinal, mensajeFinal2);
        } // termina for 01
        
        System.out.printf("%s\n", cadenaFinal);
    }
}
