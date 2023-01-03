import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);

        
        // Ekspresi nya berupa (int,long,byte,short) ,string dan enum

        System.out.println("========= PucukHarumm ==========");
        System.out.println("1. GoldLane");
        System.out.println("2. Roamer");
        System.out.println("3. Exp");
        System.out.println("4. Mid");
        System.out.println("5. Jungler");

        System.out.print("Pilih Lane : ");
        input = inputUser.next();


        switch (input){
            case "1":
            System.out.println("Betrik");
            System.out.println("Glenn`");
            break;
            case "2":
            System.out.println("Atlass");
            System.out.println("Cyy.");
            break;
            case "3":
            System.out.println("Esmee");
            System.out.println("IgoxxMdo");
            break;
            case "4":
            System.out.println("Yve");
            System.out.println("Foxy");
            break;
            case "5":
            System.out.println("Ling");
            System.out.println("Kevin");
            break;
            default:
            System.out.println("Nda adaa!!");

        }
    }
}
