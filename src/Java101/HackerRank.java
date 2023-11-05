import java.sql.SQLOutput;
import java.util.Scanner;
public class HackerRank {
    /*
     * a degeri başta sabit oalrak kalıyor -
     * b degeri çarpımda kullanılıyor b = 3 olsun 1.3 2.3 4.3 8.3 bastakı default sayılarda 2 nın katları seklınde arıyor -
     *n degeri ise satırda kaçtane sayı olacagıan karar verıyor
     * n = 8 olsa satırda 8 tane sayı olunca alta gececek
     * t kaç sayı gormek ıstedıgımız
     *
     * */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k = 1;
        System.out.println(t);
        for (int i = 0; i <= t; i++) {
            System.out.println("ds");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j <= k; j++) {

                k += k;


            }
            System.out.print(a + b * k);


        }


    }
}

