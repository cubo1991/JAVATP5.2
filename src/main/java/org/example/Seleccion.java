package org.example;

public class Seleccion {
    public static void main(int array[], String orden) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for ( int j = i + 1; j < n; j++) {
                if (orden.equals("Asc") && array[j] < array[min]) {
                    min = j;
                } else if (orden.equals("Desc") && array[j] > array[min]) {
                    min = j;
                }
            }
            int aux = array[min];
            array[min] = array[i];
            array[i] = aux;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

}
