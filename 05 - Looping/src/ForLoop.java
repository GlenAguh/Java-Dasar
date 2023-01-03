public class ForLoop {
    public static void main(String[] args) {


        System.out.println("Awal Program");
        System.out.println("Loop 1");
        for (int a =1;  a <= 10; a++) {
            for (int b =1; b <= a ;b++ ) {
            System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("2");
        for (int a =1;  a <= 10; a++) {
            for (int b =6; b >= a ;b-- ) {
            System.out.print("*");
            }
            System.out.println();
        }


       
        // System.out.println("");


        // System.out.println("Loop 2");
        // for (int a =0;  a < 10; a++) {
        //     System.out.println("Glenn" + a);
        // }

        // System.out.println("");
        // System.out.println("");


        // System.out.println("Loop 3");
        // for (int a =10;  a >= 2; a--) {
        //     System.out.println("Glenn" + a);
        // }
        // System.out.println("Akhir Program");
    }
}
