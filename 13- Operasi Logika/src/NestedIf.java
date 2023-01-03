import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // If bersarang
        Scanner inputUser = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("Masukkan nilai a : ");
        a = inputUser.nextInt();
        System.out.print("Masukkan Nilai b : ");
        b = inputUser.nextInt();

        System.out.println("Awall");
        if (a > 10){
            if (b < 10){
                System.out.println("Nilai keduanya Benarrr");
            } else {
                System.out.println("Nilai a benar nilai b salah");
            }
        } else {
            System.out.println("Nilai a salah dan b benarr");
        }
        System.out.println("End");
    }
}
