package Java101;

import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int armut, elma, domates, muz, patlıcan;
        double tutar1, tutar2, tutar3, tutar4, tutar5, tutar;
        System.out.println("Armut kaç kilo ?");
        armut = k.nextInt();
        tutar1 = armut * 2.14;

        System.out.println("Elma kaç kilo ?");
        elma = k.nextInt();
        tutar2 = elma * 3.67;

        System.out.println("Domates kaç kilo ?");
        domates = k.nextInt();
        tutar3 = domates * 1.11;

        System.out.println("Muz kaç kilo ?");
        muz = k.nextInt();
        tutar4 = muz * 0.95;

        System.out.println("Patlıcan kaç kilo ?");
        patlıcan = k.nextInt();
        tutar5 = patlıcan * 5.0;
        tutar = tutar1 + tutar2 + tutar3 + tutar4 + tutar5;

        System.out.println("Toplam tutar :  " + tutar);
    }

}

/*
 Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

*/
