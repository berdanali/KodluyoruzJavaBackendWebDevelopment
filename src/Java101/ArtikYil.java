package Java101;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner k = new Scanner(System.in);
        System.out.println("Lüfen bir yıl giriniz ... ");
        yil=k.nextInt();
        if (yil % 400 == 0 || yil % 4 == 0 && yil % 100 != 0){
            System.out.println("Bu bir artık yıldır ");
        }
        else{
            System.out.println("Bu bir artık yıl değildir ");
        }


    }
}
