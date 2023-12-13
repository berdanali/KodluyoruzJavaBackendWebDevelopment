
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        int sayi;
        double total = 0.0;
        Scanner k = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ");
        sayi = k.nextInt();
        for(int i = 1 ; i <= sayi ; i++){
            total+=(1.0/i);
        }
        System.out.println(total);
    }
}
