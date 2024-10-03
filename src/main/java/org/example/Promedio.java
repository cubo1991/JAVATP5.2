package org.example;

import java.util.Scanner;

public class Promedio {

    public static void ejercicio(Scanner sc) {
        int X = 0;
        int Y = 0;
        int suma = 0;

        while (X < 2 || Y < 2) {
            System.out.println("Ingrese la cantidad de filas: ");
            X = sc.nextInt();
            System.out.println("Ingrese la cantidad de columnas: ");
            Y = sc.nextInt();
        }
        int array[][] = new int[X][Y];
        for ( int i=0; i<array.length; i++) {
            for (int j=0; j< array[i].length; j++) {
                System.out.println("Ingresa un numero para el array en la fila " + i + " columna " + j +": ");
                int newValue = sc.nextInt();
                array[i][j] = newValue;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print("| ");
            for (int j=0; j<array[i].length ; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println("");
        }
        for ( int i=0; i<array.length; i++) {
            for (int j=0; j< array[i].length; j++) {
                suma += array[i][j];
            }
        }
        int cantidadElementos = X * Y;
        int promedioEntero = (int) Math.round(suma / cantidadElementos);
        System.out.println("El promedio de los elementos del array es: " + promedioEntero);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entro a metodo Promedio.main");
        ejercicio(sc);
    }
}
