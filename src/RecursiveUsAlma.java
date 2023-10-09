import java.util.Scanner;
public class RecursiveUsAlma {
    public static double usHesapla(double taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us < 0) {
            return 1.0 / (taban * usHesapla(taban, -us - 1));
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }
public static void main(String[] args) {
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
    Scanner input = new Scanner(System.in);
    System.out.print("Taban sayıyı girin: ");
    double taban = input.nextDouble();
    System.out.print("Üs sayıyı girin: ");
    int us = input.nextInt();
    double sonuc = usHesapla(taban, us);
    System.out.println(taban + " üzeri " + us + " = " + sonuc);
}
    }

