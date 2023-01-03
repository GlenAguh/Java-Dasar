package com.tutorial;

import java.util.Arrays;

public class ArrayMultiDimensi {

    private static void printArray2D(int [][] dataArray) {
        // Looping foreach
        System.out.print("\n");
        for (int [] baris : dataArray){
        System.out.print("[");
        for (int angka : baris){
            System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        System.out.println("Array Multi Dimensi");

        // Array 2D
        int [][] Array_2D = {
            {1,2,3},
            {5,6}
        };
       printArray2D(Array_2D);

    //    Cara membuat array 2d dengan deklarasi
        int [][] arrayAngka = new int [4] [7];
        printArray2D(arrayAngka);

        // Looping secara manual
        // for (int i = 0; i < arrayAngka.length;i++){
        //     System.out.print("[");
        //     for (int j = 0; j<arrayAngka[i].length; j++){
        //         System.out.print(arrayAngka[i][j] + ",");
        //     }
        //     System.out.print("]\n");
        // }

        // Array secara manual, untuk pembuktian
        int [][] array_2D_2 = {
            {1,2,3,4,5,6},
            {7,8,9},
            {10}
        };

        printArray2D(array_2D_2);

    }
}
