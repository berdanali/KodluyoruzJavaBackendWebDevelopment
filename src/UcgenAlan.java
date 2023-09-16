
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args){
        int kisakenar,uzunkenar;
        Scanner k = new Scanner(System.in);
        System.out.println("Lüfen kısa kenar ve uzun kenarı giriniz ... ");
        kisakenar=k.nextInt();
        uzunkenar=k.nextInt();
        double hıp1 = Math.sqrt((kisakenar*kisakenar)+(uzunkenar*uzunkenar));
        System.out.println("Hipotenüs uzunluğu : " + hıp1);

        double alan = (kisakenar*uzunkenar)/2;
        System.out.println("Üçgenin alanı  : " + alan);
    }
}
