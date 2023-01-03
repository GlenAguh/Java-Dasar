package com.tutorial;

import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";

        // Mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);

        // Concatenation (concat)
        String kalimat2 = kata + " Kamu";
        System.out.println(kalimat2);
        kata = kata + " banana";
        System.out.println(kata);

        // Concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // Lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // Replace
        String kalimat4 = kalimat.replace("pisang", "banana");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // Compare
        String motor1 = "Revoo";
        String motor2 = "Supraa";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "tahu isi";
        String gorengan2 = "Pisang Goreng";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));

        // Equality (Persamaan)
        String kataInput = "test"; // ini ada di string pool
        // String kataInput = new String("test"); // ini bukan string literal, dan tidak
        // berada di string pool
        String kataTest = "test"; // ini juga ada di string pool
        System.out.println("Persamaan pada lokasi string pool");
        if (kataInput == kataTest ){
            System.out.println("sama");
        } else {
            System.out.println("tdk sama");
        }

        System.out.println();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Mengambil input dari user : ");
        kataInput = userInput.next();
        System.out.println("ini adalah input user : " + kataInput);

        if (kataInput.equals(kataTest)){
            System.out.println("sama");
        }else{
            System.out.println("tdk sama");
        }

    }
}
