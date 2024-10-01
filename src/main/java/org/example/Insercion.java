package org.example;


public class Insercion {
    public static void hello () {
        System.out.println("Insercion");
    }
    public static void insercion(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 1; i < array.length; i++) {
            int valor = array[i];
            int j = i-1;
            while (j>=0 && array[j] > valor) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = valor;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
