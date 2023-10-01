/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int total = 0;
        int sayi;
        do {
            System.out.println("Lütfen Bir sayı giriniz ... ");
            sayi = k.nextInt();
            if(sayi %4 ==0){
              total += sayi;
            }
        }
        while (sayi%2==0);
        System.out.println(total);
    }
}
