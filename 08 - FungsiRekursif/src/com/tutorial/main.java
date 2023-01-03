package com.tutorial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        int nilai = inputUser.nextInt();
        System.out.println("Anda memasukkan " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah );

        int jumlahFaktorial = faktorial(nilai);
        System.out.println("Jumlah Faktorial= " + jumlahFaktorial );

    }
    private static int faktorial(int parameter) {
        System.out.println("Faktorial = " + parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * faktorial( parameter - 1);
    }


    private static int jumlahNilai(int parameter) {
        System.out.println("Parameter = " + parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai( parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("Nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;
        printNilai(parameter);
    }
}
