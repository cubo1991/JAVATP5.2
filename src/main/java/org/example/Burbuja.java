package org.example;

public class Burbuja {
    public static void hello () {
        System.out.println("Hola Burbuja");
    }
    public static void burbuja(int array[]) {
        int n = array.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++){
                if (array[i-1] > array[i]) {
                    int aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado == true);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
