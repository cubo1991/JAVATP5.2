package org.example;

public class Burbuja {
    public static void main(int array[], String orden) {
        int n = array.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++){
                if (orden.equals("Asc") && array[i-1] > array[i] ) {
                    int aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    intercambiado = true;
                } else if ( orden.equals("Desc") && array[i-1] < array[i] ) {
                    int aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }
}
