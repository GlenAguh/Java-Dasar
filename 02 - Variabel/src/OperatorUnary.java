public class OperatorUnary {
    public static void main(String[] args) {
        // Unary adalah operasi yang di lakukan pada satu variabel
        int angka = 1;
        System.out.printf("Unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("Unary '-', %d menjadi %d\n",angka, -angka);

        // Unary increment & decrement
        int angka2 = 10;
        angka2 ++;
        System.out.println("Nilai ++ menjadi = " + angka2);

        int angka3 = 10;
        angka3 --;
        System.out.println("Nilai -- menjadi = " + angka3);

        int a = 5;
        System.out.printf("Nilai dengan '++' prefix = %d\n",++a);
        int b = 5;
        System.out.printf("Nilai dengan '++' postfix = %d\n",b++);

        // Unary boolean ! untuk negasi
        boolean z = false;
        System.out.println("Milai boolean = "+ z);
        System.out.println("Nilai boolean = "+ !z);

    }
    
}
