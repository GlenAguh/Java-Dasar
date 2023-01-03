import java.util.Scanner;

public class KalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        float a,b,hasil;
        String operator;

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();
      

        switch (operator){
            case "+":
                // Penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                 // Pengurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
             case "/":
                // Pembagian
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                // Pembagian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;

        }
    }
}
