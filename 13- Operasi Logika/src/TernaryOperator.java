import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int input,x;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai = ");
        input = inputUser.nextInt();
        // Variabel x = ekspresi ? statement true : statement false
        x = (input == 10) ? (input * input) : (input/2);
        System.out.println("Hasilnya : " + x);
    }
}
