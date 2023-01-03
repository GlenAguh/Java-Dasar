import java.util.Scanner;

public class LoopingBersarangFor {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if ((i + j) == 4 ){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("");


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j ){
                    break;
                } else if ((i + j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("");


        System.out.print("Tinggi = ");
        int tinggi = inputUser.nextInt();

        for(int i=1; i<=tinggi; i++) {
  
            for(int j=1; j<=tinggi-i; j++) {
              System.out.print(" ");
            }
        
            for(int k=1; k<=i; k++) {
              System.out.print(" *");
            }
            System.out.println();
          }

          
          System.out.print(" Tinggi = ");
          tinggi = inputUser.nextInt();

          for(int i=0; i<= tinggi; i++) {
  
            for(int j=1; j<=i; j++) {
              System.out.print(" ");
            }
          
            for(int k=1; k<=tinggi-i; k++) {
              System.out.print(" *");
            }
            System.out.println();
          }
  }
}
