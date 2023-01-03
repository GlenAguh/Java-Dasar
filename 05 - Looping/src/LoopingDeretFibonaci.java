import java.util.Scanner;

public class LoopingDeretFibonaci {
    public static void main(String[] args) {
     // Menghitung nilai deret fibonacci ke-n
        int fn, fn1,fn2,n,keN;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Nilai Fibonacci ke - :");
        n = inputUser.nextInt();
        fn2 = 0;
        fn1 = 1;
        fn = 1;
        keN = 1;

        // for
        // for (int i = 1 ; i <= n ; i++){
        //     System.out.println("Nilai ke- " + i +" adalah " + fn);
        //     fn = fn1 + fn2;
        //     fn2 = fn1;
        //     fn1 = fn;
        // }

        // while
        // while (keN <= n) {
        //     System.out.println("Nilai ke- " + keN + "Adalah " + fn);
        //     fn = fn1 + fn2;
        //     fn2 = fn1;
        //     fn1 = fn;
        //     keN++;
        // }

        // do while
        do {
            System.out.println("Nilai ke- " + keN + "Adalah " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            keN++;
        } while(keN <= n);

    }


}
