package Java101;

import java.sql.SQLOutput;
import java.util.Scanner;
/*      Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int temp;
        System.out.println("Lütfen bir sıcaklık değeri giriniz ... ");
        temp = k.nextInt();

        if(temp<5){
            System.out.println("Sıcaklık değeri 5 derecedir yapılacak etkinlikler: Kayak ");
        }
        else if (temp>=5 && temp<15) {
            System.out.println("Sıcaklık değeri 5 ile 15 derece arasındadır yapılacak etkinlikler: Sinema  ");
        }
        else if (temp>=15 && temp<25) {
            System.out.println("Sıcaklık değeri 15 ile 25 derece arasındadır yapılacak etkinlikler: Piknik  ");
        }
        else
            System.out.println("Sıcaklık değeri 25 dereceden büyüktür yapılacak etkinlikler: Yüzme  ");


    }
}
