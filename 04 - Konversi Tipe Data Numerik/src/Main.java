public class Main {
    public static void main(String[] args) {
        // Program konversi data

        int nilaiInt = 450;  // 32 bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lkebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        // memperkecil rentang ke tipe data yang lebih besar
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        int a = 10;
        int b = 4;
        float c = a / b;
        System.out.printf("%d / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float) x / y;
        System.out.printf("%d / %d = %f",x,y,z);
    }
}
