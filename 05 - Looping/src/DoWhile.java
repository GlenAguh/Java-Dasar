public class DoWhile {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Glenn" + a);
            if (a == 10){
                kondisi = false;
            }
        }while (kondisi);
        System.out.println("Akhir Program");
    }
}
