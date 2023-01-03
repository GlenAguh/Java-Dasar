import java.util.Scanner;

public class PengelompokanOperasiAritmatika {
    public static void main(String[] args) {
        int hasil = 10 * 4 + 2;
        System.out.println(hasil);

        hasil = 100 / (10 + 10);
        System.out.println(hasil); 


        Scanner userInput = new Scanner(System.in);
        System.out.println("Menghitung Persamaan Kuadrat");
        int m, x, c;
        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradien m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;
        System.out.println("Nilai c = " + y);

    }
}
