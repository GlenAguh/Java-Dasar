import javax.print.attribute.standard.PrinterMessageFromOperator;

public class OperatorAritmatika {
    public static void main(String[] args) {
        // Operasi Aritmatika
        int variabel1 = 12;
        int variabel2 = 5;
        int hasil;

        // Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);


        // Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil );


        // Perkalian
        hasil = variabel1 * variabel2;
        System.out.println(variabel1 + " * " + variabel2 + " = " + hasil);


        // Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);
        
        float a = 5;
        float b = 10;
        float hasilfloat = a / b ;
        System.out.println(a + " / " + b + " = " + hasilfloat);


        // Modulus (sisa pembagian)
        hasil = variabel1 % variabel2;
        System.out.println(variabel1 + " % " + variabel2 + " = " + hasil);
    }
}
