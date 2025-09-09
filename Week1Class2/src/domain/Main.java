/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Scanner;

/**
 *
 * @author edwim
 */
public class Main {
    public static void main(String[] args) {
        // Crear un cuadrado de 5 filas y 9 columnas
        Cuadrado miCuadrado = new Cuadrado(5, 9);

        // Imprimir el patrón en consola
        miCuadrado.imprimirPatron();
    }
}

 