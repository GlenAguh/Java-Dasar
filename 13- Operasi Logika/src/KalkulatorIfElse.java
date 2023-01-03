import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        float a,b,hasil;
        char operator;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextInt();

        System.out.println("Input user " + a + " " + operator + " " + b);

        // Operator tersedia * / - + 

        if (operator == '+'){
            // Penjumlahan
            hasil = a + b;
            System.out.println("Hasill Penjumlahan = " + hasil);
        } else if (operator == '*'){
            // Perkalian
            hasil = a * b;
            System.out.println("Hasill Perkalian = " + hasil);
        } else if (operator == '/'){
            // Pembagian
            if (b == 0 ){
                System.out.println("Pembagian nol menghasilkan nilai yang tak terhingga");
            } else if (a == 0){
                System.out.println("Pembagian nol menghasilkan nilai yang tak terhingga");
            } else {
                hasil = a / b;
                System.out.println("Hasill Pembagian = " + hasil);
            }
          
        } else if (operator == '-'){
            // Pengurangam
            hasil = a - b;
            System.out.println("Hasill Pengurangan = " + hasil);
        } else {
            System.out.println("Operasi tidak di temukan!!");
        }
        
    }
}
