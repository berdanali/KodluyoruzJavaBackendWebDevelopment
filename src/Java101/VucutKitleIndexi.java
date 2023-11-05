package Java101;

import java.sql.SQLOutput;
import java.util.Scanner;
public class VucutKitleIndexi {
    public static void main(String[] args) {
        int kilo;
        double boy,index;
        Scanner k = new Scanner(System.in);
        System.out.println("Lüfen boyunuzu metre cinsinden giriniz ... ");
        boy = k.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz ... ");
        kilo = k.nextInt();
        index = kilo / (boy*boy);
        System.out.println("Vucut kitle indexsiniz : " + index);
    }
}
