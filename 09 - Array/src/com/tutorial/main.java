package com.tutorial;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Assignment
        System.out.println("Array assignment");
        int [] arrayInteger = {1,2,3,4};
        arrayInteger [1] = 20; 
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println();

        System.out.println("Array Deklarasi");
        float [] arrayFloat = new float [5];
        arrayFloat[3] = 12;
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        // cara cepat menampilkan array
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));

    }
}
