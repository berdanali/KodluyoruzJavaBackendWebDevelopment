import java.util.Scanner;
/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
public class KalanBulma {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac=0,top=0,ort;
        System.out.println("Lütfen bir sayı giriniz ");
        int sayi = k.nextInt();
        for(int i = 1 ; i<=sayi ; i++){
            if(i%3 == 0 && i%4 ==0) {
                top +=i;
                sayac++;
            }
        }
        ort = top/sayac;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması:"  + ort );
    }
}
