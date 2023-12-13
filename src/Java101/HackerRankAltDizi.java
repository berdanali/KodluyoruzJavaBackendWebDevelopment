import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HackerRankAltDizi {
    public static void main(String[] args) {
        int[] dizi = new int[5];
        System.out.println("Lütfen 5 elemanlı bir dizi giriniz ");
        Scanner k = new Scanner(System.in);
        for(int i = 0 ; i < dizi.length;i++){
            dizi[i] =k.nextInt();
        }
        String sayilar="";
        for (int i = 0 ; i<dizi.length;i++){
            sayilar += dizi[i] + " ";
        }
        for (int i = 0 ; i<dizi.length;i++){
            for (int j = 1 ; j<dizi.length;j++){
               if(dizi[i] + dizi[j] < 0){
                   System.out.println("asda");
               }
            }
        }


        System.out.println("Diziniz : " + sayilar);

    }

}
