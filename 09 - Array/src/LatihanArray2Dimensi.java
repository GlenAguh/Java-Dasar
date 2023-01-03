import com.tutorial.main;

public class LatihanArray2Dimensi {
    public static void main(String[] args) {
        int [][] matrix_a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
       } ;
      int matrix_b [][] = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
      };
      printArray(matrix_a);
      printArray(matrix_b);
    }
    private static void printArray(int [][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0;i < baris;i++){
            System.out.print("[");
            for (int j = 0; i <kolom;j++){
                System.out.print(dataArray[i][j]);

                if (j < kolom - 1){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
    }
}

