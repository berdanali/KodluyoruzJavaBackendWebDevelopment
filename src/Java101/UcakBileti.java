package Java101;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = scanner.nextInt();
        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            double ucret = 0.10 * mesafe;

            if (yas < 12) {
                ucret *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                ucret *= 0.9;
            } else if (yas >= 65) {
                ucret *= 0.7;
            }
            if (yolculukTipi == 2) {
                ucret *= 0.8;
            }
            System.out.println("Toplam Bilet Fiyatı: " + ucret + " TL");
        }
    }
}
