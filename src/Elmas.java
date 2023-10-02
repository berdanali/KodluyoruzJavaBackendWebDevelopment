import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int yukseklik = scanner.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
        } else {
            for (int i = 1; i <= yukseklik; i += 2) {
                for (int j = 1; j <= (yukseklik - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = yukseklik - 2; i >= 1; i -= 2) {
                for (int j = 1; j <= (yukseklik - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

