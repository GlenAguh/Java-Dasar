package com.tutorial;

import java.util.Scanner;
import java.lang.String;

public class RekursifBercabang {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        int nilai = inputUser.nextInt();
        int nilaiFibonacci = fibonacci(nilai, "atas");
        System.out.println("Nilai fibonacci ke- " + nilai + " adalah " + nilaiFibonacci);

    }
    private static int fibonacci(int n , String daun) {
        System.out.println(" Daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        } else {
            return fibonacci(n - 1 , "Kiri") + fibonacci (n - 2 , "kanan");
        }

    }
}
