package Java101;

import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplamNot = 0;
        int dersSayisi = 0;

        System.out.print("Matematik notunu girin (0-100): ");
        int matematik = scanner.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplamNot += matematik;
            dersSayisi++;
        }

        System.out.print("Fizik notunu girin (0-100): ");
        int fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        }

        System.out.print("Kimya notunu girin (0-100): ");
        int kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        }

        System.out.print("Türkçe notunu girin (0-100): ");
        int turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        }

        System.out.print("Müzik notunu girin (0-100): ");
        int muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }

        scanner.close();

        if (dersSayisi > 0) {
            double ortalama = (double) toplamNot / dersSayisi;

            if (ortalama >= 50) {
                System.out.println("Derslerin ortalaması: " + ortalama + " Geçtiniz!");
            } else {
                System.out.println("Derslerin ortalaması: " + ortalama + " Kaldınız!");
            }
        } else {
            System.out.println("Geçerli ders notu bulunamadı.");
        }
    }
}
