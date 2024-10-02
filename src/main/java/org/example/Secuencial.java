package org.example;

public class Secuencial {
    public static void main(String array[], String cadena) {
        boolean found = false;
        for (int i=0; i < array.length; i++) {
            if (array[i] == cadena) {
                found = true;
                break;
            }
        }
        System.out.print(found);
    }
}