package com.tutorial;

public class ArrayForEach {
    public static void main(String[] args) {
        int [] arrayAngka = {1,2,3,4,5,6,7,8,9,10};

        // Looping standard
        System.out.println("Looping Standard");
        for (int i = 0 ; i < 10; i++){
            System.out.println("index ke " + i + "adalah = " + arrayAngka[i]);
        }

        // Looping dengan properti array
        System.out.println("Looping dengan length");
        for (int i=0;i < arrayAngka.length;i++){
            System.out.println("index ke " + i + "adalah = " + arrayAngka[i]);
        }

        // Looping khususon untuk collection <-- array 
        System.out.println("Looping for each");
        for (int angka : arrayAngka){
            System.out.println("Angka pada looping ini = " + angka);
        }
    }
}
