import java.util.Scanner;

public class LatihanLoopingSederhana {
    public static void main(String[] args) {
        // Program menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.println("Nilai Akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
        // While
        while (nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println("Di tambah " + nilaiAwal + " Menjadi " + total);
            nilaiAwal++;
        }
 
        // Do WHile
        // do {
        //     total = total + nilaiAwal;
        //     System.out.println("Di tambah " + nilaiAwal + " Menjadi " + total);
        //     nilaiAwal++;
        // } while (nilaiAwal <= nilaiAkhir);

        // For
        // for (;nilaiAwal <= nilaiAkhir;nilaiAwal++) {
        //     total = total + nilaiAwal;
        //     System.out.println("Di tambah " + nilaiAwal + " Menjadi " + total);
        // }
        
    }
}
