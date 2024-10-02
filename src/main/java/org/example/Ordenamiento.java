package org.example;

import java.util.Scanner;

public class Ordenamiento {

    public static void llenarArray(int arr[], Scanner sc) {
        for ( int i=0; i<arr.length; i++) {
            System.out.println("Ingresa un numero para el array en la posicion " + i + ": ");
            int newValue = sc.nextInt();
            arr[i] = newValue;
        }
    }
    public static void ejercicio(Scanner sc, String ordenamiento, String orden) {
        int array[] = new int[20];
//        for ( int i=0; i<array.length; i++) {
//            System.out.println("Ingresa un numero para el array en la posicion " + i + ": ");
//            int newValue = sc.nextInt();
//            array[i] = newValue;
//        }

        System.out.println("El ordenamiento elegido es -" + ordenamiento + "- -" + orden + "-");
        switch (ordenamiento) {
            case "burbuja":
                if (orden.equals("Asc")) {
                    llenarArray(array, sc);
                    Burbuja.main(array, orden);
                } else if (orden.equals("Desc")) {
                    llenarArray(array, sc);
                    Burbuja.main(array, orden);
                } else {
                    System.out.print(" Vuelve a ejecutar el programa con un orden Asc o Desc");
                }
                break;
            case "seleccion":
                if (orden.equals("Asc")) {
                    llenarArray(array, sc);
                    Seleccion.main(array, orden);
                } else if (orden.equals("Desc")) {
                    llenarArray(array, sc);
                    Seleccion.main(array, orden);
                } else {
                    System.out.print(" Vuelve a ejecutar el programa con un orden Asc o Desc");
                }
                break;
            case "insercion":
                if (orden.equals("Asc")) {
                    llenarArray(array, sc);
                    Insercion.main(array, orden);
                } else if (orden.equals("Desc")) {
                    llenarArray(array, sc);
                    Insercion.main(array, orden);
                } else {
                    System.out.print(" Vuelve a ejecutar el programa con un orden Asc o Desc");
                }
                break;
            default:
                System.out.print("Ordenamiento no encontrado");
        }
    }

    public static void main(String ordenamiento, String orden) {
        Scanner sc = new Scanner(System.in);
        ejercicio(sc, ordenamiento, orden);
    }
}
