
public class OperatorBitwise {
    public static void main(String[] args) {
        // Operator Bitwise --> operator untuk melakukan operasi pada bit

        // byte a = 0;
        // // byte b,c;
        // String a_bits;

        // Operator SHIFT LEFT
        // System.out.println("==== SHIFT LEFT ====");
        // a_bits = String.format("%8s",Integer.toBinaryString(a)).replace("","0");
        // System.out.printf("$s = %d\n ", a_bits,a);

        // b = (byte) (a << 3);
        // a_bits = String.format("%8s", Integer.toBinaryString(a));
        // System.out.printf("$s = %d ", b_bits,b);

        int a = 181;
        int b = 108;
        int hasil;

        hasil = a & b;
        System.out.println("Hasil dari a & b : " + hasil);
        hasil = a | b;
        System.out.println("Hasil dari a | b : " + hasil);

        hasil = a ^ b;
        System.out.println("Hasil dari a ^ b : " + hasil);

        hasil = ~a;
        System.out.println("Hasil dari ~a : " + hasil);

        hasil = a >> 1;
        System.out.println("Hasil dari a >> 1 : " + hasil);

        hasil = b << 2;
        System.out.println("Hasil dari b << 2 : " + hasil);

    }
}