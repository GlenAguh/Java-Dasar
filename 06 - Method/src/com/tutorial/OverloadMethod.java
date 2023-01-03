package com.tutorial;

public class OverloadMethod {
    public static void main(String[] args) {
        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah (4.5f , 4);
        printAngka(hasilFloat); 

        hasilFloat = tambah (5, 2.5);
        printAngka(hasilFloat);

        // hasilInteger = tambah (11,12,13);
        // printAngka(hasilInteger);

        printAngka(16.7d);
        printAngka(24.5);
        printAngka(20);
        


    }
    private static float tambah(int angkaInt2, float angkaFloat1) {
        return angkaFloat1 + angkaInt2;

    private static float tambah(Float angkaFloat1, int angkaInt2) {
        return angkaFloat1 + angkaInt2;
    }
    private static int tambah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(Double angkaDouble) {
        System.out.println("Angka ini adalah double dengan nilai = " + angkaDouble);
    }

    private static void printAngka(Float angkaFloat) {
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }


    private static void printAngka(int angkaInteger) {
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
