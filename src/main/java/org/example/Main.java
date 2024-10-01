package org.example;

public class Main {
    public static void burbuja(){
        int[] array = {1,5,3,4,2};
        Burbuja.burbuja(array);
    }
    public static void insercion() {
        int[] array = {1,5,3,4,2};
        Insercion.insercion(array);
    }

    public static void main(String[] args) {
//        insercion();
        burbuja();
    }
}
