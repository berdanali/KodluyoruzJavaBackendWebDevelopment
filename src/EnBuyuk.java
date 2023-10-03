

/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
bu sayıları ekrana yazan programı yazın.*/


import java.util.Scanner;
public class EnBuyuk {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi,n;
        System.out.println("Kaç adet sayı gireceksiniz ?");
        n = k.nextInt();

        if(n<0){
            System.out.println("Lütfen pozitif değer giriniz ");

        }
        System.out.println("1. sayıyı giriniz :");
        sayi=k.nextInt();
        int max = sayi;
        int min = sayi;
        for(int i = 2 ; i<=n;i++){
            System.out.println(i + ". sayıyı giriniz ");
            sayi=k.nextInt();
            if (sayi>max){
                max = sayi;
            }
            if(sayi<min){
                min = sayi;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
