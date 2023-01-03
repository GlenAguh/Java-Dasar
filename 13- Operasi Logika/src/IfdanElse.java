import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfdanElse {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner (System.in);
        int a = 0;
        System.out.print("Masukkan nilai = ");
        a = inputUser.nextInt(); 
        // if dan else statement
        if (a > 10 ){
            System.out.println("Ini adalah aksi 1");
        } else if (a < 10){
            System.out.println("Ini adalah aksi 2");
        } else {
            System.out.println("Noo!!!");
        }
        System.out.println("Selesaii");
    }
}
