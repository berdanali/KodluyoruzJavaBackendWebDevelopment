package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Tutar giriniz :");
        double price = k.nextDouble();

        System.out.println("Kard No giriniz :");
        String cardNumber =k.next();

        System.out.println("Son kullanım tarihini giriniz :");
        String date = k.next();

        System.out.println("Güvenlik kodunu giriniz :");
        String cvc = k.next();

        System.out.println("1. A bankası");
        System.out.println("1. B bankası");
        System.out.println("1. C bankası");
        System.out.println("Lütfen bir banka seçiniz ... ");
        int selectBank=k.nextInt();
        switch (selectBank){
            case 1 :
                aBank a = new aBank("A bankası " , "23" , "22341");
                a.connect("127.0.8.1");
                a.payment(price , cardNumber ,date , cvc );
                break;
            case 2:
                bBank b = new bBank("B bankası " , "33" , "2234211");
                b.connet("127.0.6.1");
                b.paymnet(price ,cardNumber,date,cvc);
            default:
                System.out.println("Geçerli bir banka giriniz ");
        }
    }
}
