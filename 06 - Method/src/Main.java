import javax.lang.model.util.SimpleElementVisitor14;

public class Main {
    public static void main(String[] args) {
        System.out.println(simple());
        fungsiVoid("Glenn");
        Hero("Betrik");
        Hero("Atlas");


    }

    private static void Hero(String nama) {
        System.out.println("Hero ml " + nama);
    }

    private static void fungsiVoid(String input) {
        System.out.println(input);
    }
    private static float simple () {
        return 10.0f;
    }
}
