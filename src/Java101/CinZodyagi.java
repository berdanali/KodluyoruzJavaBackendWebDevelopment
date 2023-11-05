package Java101;

import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int dogumyili;
        System.out.println("Lütfen doğum yılınızı giriniz ... Örn: 1999");
        dogumyili=k.nextInt();
        if(dogumyili>1900 ){
            if(dogumyili%12 == 0){
                System.out.println("Çin Zodyağı Burcunuz : Maynun");
            }
            else if(dogumyili%12 == 1){
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
            }
            else if(dogumyili%12 == 3){
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
            }
            else if(dogumyili%12 == 4){
                System.out.println("Çin Zodyağı Burcunuz : Fare");
            }
            else if(dogumyili%12 == 5){
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
            }
            else if(dogumyili%12 == 6){
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
            }
            else if(dogumyili%12 == 7){
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
            }
            else if(dogumyili%12 == 8){
                System.out.println("Çin Zodyağı Burcunuz : Ejdarha");
            }
            else if(dogumyili%12 == 9){
                System.out.println("Çin Zodyağı Burcunuz : Yılan");
            }
            else if(dogumyili%12 == 10){
                System.out.println("Çin Zodyağı Burcunuz : At");
            }
            else if(dogumyili%12 == 11){
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
            }
        }
        else{
            System.out.println("Lütfen geçerli bir tarih giriniz ...");
        }



    }
}
