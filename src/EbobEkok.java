
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1, num2, ebob = 1, ekok = 1;
        System.out.println("Lütfen birininci sayıyı giriniz ");
        num1 = k.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz ");
        num2 = k.nextInt();
        int i = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        int j = 2;
        while (j <= num1 * num2) {
            if (j % num1 == 0 && j % num2 == 0) {
                ekok = j;
                System.out.println(j + "j");
                break;
            }
            j++;
        }
        System.out.println("Girilen sayıların ebobu : " + ebob);
        System.out.println("Girilen sayıların ekoku : " + ekok);
    }
}
