import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asal = true;

            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(sayi + " ");
            }
        }
    }
}






