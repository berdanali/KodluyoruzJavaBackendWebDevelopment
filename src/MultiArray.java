import java.util.Scanner;
public class MultiArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
       int number =1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length;j++) {
                matrix[i][j] =number++;
            }
        }
        for (int i = 0; i < matrix.length; i++){
           for( int j = 0; j < matrix[i].length; j++){
               System.out.print(matrix[i][j] + " ");
           }
            System.out.println();
        }
    }
}
