import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        double kdv1 = 0.18;
        double kdv2 = 0.08;
        Scanner k = new Scanner(System.in);
        System.out.println("Lüfen paranın miktarını giriniz ... ");
        int para =k.nextInt();
        if(para < 1000){
            double sonuc = (para*kdv1)+para;
            System.out.println("KDV tutarı : " + kdv1 );
            System.out.println("Paranızın KDV'li değeri : " + sonuc);
        } else if (para>1000) {
            double sonuc = (para*kdv2)+para;
            System.out.println("KDV tutarı : " + kdv2 );
            System.out.println("Paranızın KDV'li değeri : " + sonuc);

        }


        /*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.   */



    }
}
