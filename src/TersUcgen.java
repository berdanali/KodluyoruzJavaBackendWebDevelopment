import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamakSayisi = k.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2 * i - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







