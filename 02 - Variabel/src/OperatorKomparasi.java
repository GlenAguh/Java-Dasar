public class OperatorKomparasi {
    public static void main(String[] args) {
    // Operasi komparasi akan menghasilkan nilai boolean
        int a,b;
        boolean hasilKomparasi;

        // Operator equal / persamaan
        System.out.println("----Persamaan----");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s\n",a,b,hasilKomparasi);
        a = 11;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s\n",a,b,hasilKomparasi);

        System.out.println("");
        System.out.println("");


         // Operator not equal / pertidakpersamaan
         System.out.println("----Pertidaksamaan----");
         a = 10;
         b = 10;
         hasilKomparasi = (a != b);
         System.out.printf("%d != %d ---> %s\n",a,b,hasilKomparasi);
         a = 11;
         b = 10;
         hasilKomparasi = (a != b);
         System.out.printf("%d != %d ---> %s\n",a,b,hasilKomparasi);


         System.out.println("");
         System.out.println("");


         // Operator less than / kurang dari
         System.out.println("----Kurang Dari----");
         a = 10;
         b = 10;
         hasilKomparasi = (a < b);
         System.out.printf("%d < %d ---> %s\n",a,b,hasilKomparasi);
         a = 11;
         b = 10;
         hasilKomparasi = (a < b);
         System.out.printf("%d < %d ---> %s\n",a,b,hasilKomparasi);
         a = 9;
         b = 10;
         hasilKomparasi = (a < b);
         System.out.printf("%d < %d ---> %s\n",a,b,hasilKomparasi);


         System.out.println("");
         System.out.println("");


         // Operator greather than / lebih dari
         System.out.println("----Lebih Dari----");
         a = 10;
         b = 10;
         hasilKomparasi = (a > b);
         System.out.printf("%d > %d ---> %s\n",a,b,hasilKomparasi);
         a = 11;
         b = 10;
         hasilKomparasi = (a > b);
         System.out.printf("%d > %d ---> %s\n",a,b,hasilKomparasi);
         a = 9;
         b = 10;
         hasilKomparasi = (a > b);
         System.out.printf("%d > %d ---> %s\n",a,b,hasilKomparasi);


         System.out.println("");
         System.out.println("");


         // Operator less than equal / kurang dari sama dengan
         System.out.println("----Kurang Dari Sama Dengan----");
         a = 10;
         b = 10;
         hasilKomparasi = (a <= b);
         System.out.printf("%d <= %d ---> %s\n",a,b,hasilKomparasi);
         a = 11;
         b = 10;
         hasilKomparasi = (a <= b);
         System.out.printf("%d <= %d ---> %s\n",a,b,hasilKomparasi);
         a = 9;
         b = 10;
         hasilKomparasi = (a <= b);
         System.out.printf("%d <= %d ---> %s\n",a,b,hasilKomparasi);


         System.out.println("");
         System.out.println("");


         // Operator greather than equal / lebih dari sama dengan
         System.out.println("----Lebih Dari Sama Dengan----");
         a = 10;
         b = 10;
         hasilKomparasi = (a >= b);
         System.out.printf("%d >= %d ---> %s\n",a,b,hasilKomparasi);
         a = 11;
         b = 10;
         hasilKomparasi = (a >= b);
         System.out.printf("%d >= %d ---> %s\n",a,b,hasilKomparasi);
         a = 9;
         b = 10;
         hasilKomparasi = (a >= b);
         System.out.printf("%d >= %d ---> %s\n",a,b,hasilKomparasi);


    }
}
