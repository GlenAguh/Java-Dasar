package com.tutorial;

import java.util.Scanner;

import javax.xml.transform.Source;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        int [] array = {0,1,2,3};
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.printf("nilai array ke : ");
        int index = userInput.nextInt();

        // Exception handling (try, catch, finally)
        System.out.println("Handling out of bound");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index] );
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        // runtime error jika file tidak ada 
        System.out.println("Handling IO not found");
        try{
            fileInput = new FileInputStream("input.txt");
        }catch(IOException e){
            System.err.println(e);
        }

        // Menggabungkan dua exception
        System.out.println("Menggabungka dua buah exception");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }catch(IOException e){
            System.err.println("file tidak di temukan");
        }

        // Finally
        System.out.println("Menambahkan finnally");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang di masukan tidak sesuia dengan jumlah array");
        }finally{
            System.out.println("Finally");
        }
        System.out.println("\nAkhir Program");

    }
}
