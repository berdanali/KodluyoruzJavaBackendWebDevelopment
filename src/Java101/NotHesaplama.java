
import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        int matnot, notfiz, notkim, nottur, nottar, notmuz;
        Scanner k = new Scanner(System.in);

        System.out.println("Lütfen Matematik notunuzu giriniz");
        matnot = k.nextInt();

        System.out.println("Lütfen Fizik notunuzu giriniz");
        notfiz = k.nextInt();

        System.out.println("Lütfen Kimya notunuzu giriniz");
        notkim = k.nextInt();

        System.out.println("Lütfen Türkçe notunuzu giriniz");
        nottur = k.nextInt();

        System.out.println("Lütfen Tarih notunuzu giriniz");
        nottar = k.nextInt();

        System.out.println("Lütfen Müzik notunuzu giriniz");
        notmuz = k.nextInt();


        int top = (matnot + notfiz + notkim + nottur + nottar + notmuz);
        double sonuc = (top/6);
        System.out.println("Tüm derslerin not ortalaması : " + sonuc);
        boolean sinifiGecti = sonuc >= 60;
        System.out.println(sinifiGecti ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
