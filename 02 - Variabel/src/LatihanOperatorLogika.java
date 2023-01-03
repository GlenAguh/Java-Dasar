import java.util.*;
class LatihanOperatorLogika{
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        // Sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan Nilai Tebakan Anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai Tebakan Adalah = " + nilaiTebakan);

        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan Anda = " + statusTebakan);

        // Operasi aljabar boolean (or / and)
        System.out.print("Masukkan Nilai di antara 4 dan 8 : ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4 )  &&  (nilaiTebakan < 8);
        System.out.println("Tebakan Anda : " + statusTebakan);
    }
}