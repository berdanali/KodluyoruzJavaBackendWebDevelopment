import java.util.Arrays;
import java.util.Scanner;
public class TranspozMatris {
        public static void main(String[] args) {
            //Matris Transpozunu ekrana yazdırma uygulaması
            int[][] matris = {{1, 5}, {4, 6}, {7, 3}};
            System.out.println("Matris : ");
            for (int[] row : matris) {
                for (int column : row) {
                    System.out.print(" " + column + " ");
                }
                System.out.println();
            }
            System.out.println("Transpozunu : ");
            int column = matris[0].length;
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < matris.length; j++) {
                    System.out.print(" " + matris[j][i] + " ");
                }
                System.out.println();
            }
        }
    }

