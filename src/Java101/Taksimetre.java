package Java101;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double total, baslangic=10,perkm=2.2;

        Scanner k = new Scanner(System.in);
        System.out.println("Lütfen gitmek istediğiniz mesafenini uzaklığını yazınız ");
        km = k.nextInt();

        total = (km*perkm);
        total += baslangic;

        total =(total<20) ? 20 : total;
        System.out.print("Toplam tutar : " + total);


    }
}


/*
Java101.Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Java101.Taksimetre açılış ücreti 10 TL'dir.
 */