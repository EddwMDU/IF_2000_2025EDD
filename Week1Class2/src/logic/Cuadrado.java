/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author edwim
 */
public class Cuadrado {
     
   

    public void imprimirPatron(int n) {
        int centroFila = filas / 2;
        int centroColumna = columnas / 2;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Condición para imprimir asterisco
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1 || (i == centroFila && j == centroColumna)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // Espacio entre asteriscos
            }
            System.out.println();
        }
    }
}
