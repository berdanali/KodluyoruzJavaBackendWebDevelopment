package Java101;

import java.util.Scanner;

/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz. */
public class DortveBesinKatlari {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int sayi;
        System.out.println("Lütfen bir sayı giriniz ");
        sayi = k.nextInt();

        for(int i =1 ; i<=sayi;i*=4){
            System.out.print("4'ün katları olan sayılar :" + i);
           }
        for(int j =1 ;j <=sayi;j*=5){
            System.out.print("5'in katları olan sayılar :" + j);
        }

    }
}
