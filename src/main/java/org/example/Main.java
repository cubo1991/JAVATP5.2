package org.example;

public class Main {
    public static void insercion() {
        int[] array = {10,7,2,6,3,1,5,4};
        Insercion.main(array, "Desc");
    }

    public static void burbuja(){
        int[] array = {10,7,2,6,3,1,5,4};
        Burbuja.main(array, "Desc");
    }

    public static void seleccion() {
        int[] array = {10,7,2,6,3,1,5,4};
        Seleccion.main(array, "Desc");
    }

    public static void secuencial() {
        String[] array = {"Pepe","Marco","CR7"};
        Secuencial.main(array, "CR7");
    }

    public static void main(String[] args) {
//        insercion();
//        burbuja();
        seleccion();
//        secuencial();
    }
}
