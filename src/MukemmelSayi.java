import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, bolen = 0, deger;
        Scanner k = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ... ");
        sayi = k.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolen += i;
            }
        }
        if (sayi == bolen) {
            System.out.println("Bu bir mükemmel sayıdır ");
        } else {
            System.out.println("Bu bir mükemmel sayı değildir ");
        }
    }
}
