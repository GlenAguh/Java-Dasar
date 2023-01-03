public class While {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal program");

        while (kondisi) {
            System.out.println("Glenn "+ a );
            if (a == 10){
                kondisi = false;
            }
            a++;
        }
        System.out.println("Akhir Program");
    }
}
