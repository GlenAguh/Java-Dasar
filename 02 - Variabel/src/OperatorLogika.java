public class OperatorLogika {
    public static void main(String[] args) {
        // Operator logika --> operasi yang bisa di lakukan pada tipe data boolean
        // AND, OR, XOR , dan Negasi
        boolean a,b,c;

        // OR / atau (||)
        System.out.println("==== OR ====");
        a = false;
        b =  false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b =  true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b =  false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b =  true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);


        System.out.println("");
        System.out.println("");

         // AND / dan (&&)
         System.out.println("==== AND ====");
         a = false;
         b =  false;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);
         a = false;
         b =  true;
         c = (a && b); 
         System.out.println(a + " && " + b + " = " + c);
         a = true;
         b =  false;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);
         a = true;
         b =  true;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);


        System.out.println("");
        System.out.println("");

         // XOR / eklusiv (^)
         System.out.println("==== XOR ====");
         a = false;
         b =  false;
         c = (a ^ b);
         System.out.println(a + " ^ " + b + " = " + c);
         a = false;
         b =  true;
         c = (a ^ b); 
         System.out.println(a + " ^ " + b + " = " + c);
         a = true;
         b =  false;
         c = (a ^ b);
         System.out.println(a + " ^ " + b + " = " + c);
         a = true;
         b =  true;
         c = (a ^ b);
         System.out.println(a + " ^ " + b + " = " + c);


         System.out.println("");
         System.out.println("");


        //  NOT / negasi --> flipping (!)
        System.out.println("==== NEGASI ====");
        a = true;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
        a = false;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
    }
}
