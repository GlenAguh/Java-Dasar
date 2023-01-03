package com.tutorial;

import java.util.Arrays;

public class OperasiArray {
    public static void main(String[] args) {
       int [] arrayAngka1 = {1,2,3,4,5};
    
    // Merubah array menjadi string 
        System.out.println("Merubah array menjadi string");
        printArray(arrayAngka1);

        // Mengcopy array
        System.out.println("Mengcopy Array");
        int [] arrayAngka2 = new int [5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        // Mengcopy dengan Loop
        System.out.println("Mengcopy dengan Loop");
        for (int i = 0;i<arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        // mengcopy dengan copyOf
        System.out.println("Mengcopy dengan copyOf");
        int [] arrayAngka3 = Arrays.copyOf(arrayAngka1, 4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        // Mengcopy dengan copyOfRange
        System.out.println("Mengcopy dengan copyOfRange");
        int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // Fill array
        System.out.println("Fill Array");
        int [] arrayAngka5 = new int [10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        // Komparasi Array
        System.out.println("Komparasi Array");
        int [] arrayAngka6 = {1,2,3,4,5};
        int [] arrayAngka7 = {1,2,3,4,3};
        System.out.println("Membandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));
        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("Sama");
        } else {
            System.out.println("Beda");
        }

        // Mengecek array mana yang lebih besar
        System.out.println(" Mengecek array mana yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        // Mengecek index mana yang berbeda
        System.out.println("Mengecek index mana yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));


        // Sort Array
        System.out.println();
        System.out.println("Sort Array");
        int [] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search Array
        System.out.println("Search array");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("Angka " + angka + " ada di index " + posisi);

    }


    private static void printArray(int [] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
