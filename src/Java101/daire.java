package Java101;

import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        double yaricap,cevre,alan,pi=3.14,dilimalan;
        int olcu;
        System.out.println("Lütfen dairenin yarıçapını giriniz ");
        Scanner k = new Scanner(System.in);
        yaricap = k.nextDouble();
        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;
        System.out.println("ALAN : " + alan  + " ÇEVRE : " + cevre);

        System.out.println("Lütfen merkez açının ölçüsünü  giriniz : ");
        olcu = k.nextInt();

        dilimalan = (pi*(yaricap*yaricap) * olcu) /360;
        System.out.println("Daire dilimin alanı : " + dilimalan);

    }
}



/*
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan Java101.daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
*/