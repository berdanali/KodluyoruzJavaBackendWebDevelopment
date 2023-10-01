// 156 *********** 1+5+6
import java.util.Scanner;
public class BasamakSayilarinToplami {
    public static void main(String[] args) {
        int sayi,bir,on,yuz;
        Scanner k = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz ... ");
        sayi = k.nextInt();
        bir = sayi%10;
        on = (sayi%100 - bir)/10;
        yuz = (sayi-on-bir)/100;
        int total = yuz + on + bir;
        System.out.println("Sayanın bamaaklar toplamı : " + total );

    }
}
