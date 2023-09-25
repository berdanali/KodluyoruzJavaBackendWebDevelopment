import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1,num2,select;
        System.out.println("Lütfen birinci sayıyı giriniz ... ");
        num1 = k.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz ... ");
        num2 = k.nextInt();

        System.out.println(" 1: Toplama\n 2: Çıkarma\n 3: Çarpma\n 4: Bölme");
        System.out.println("Seçiniz");
        select=k.nextInt();

        switch (select){
            case(1):
                System.out.println(num1 + num2 );
                break;
            case(2):
                System.out.println(num1 - num2);
                break;
            case(3):
                System.out.println(num1 * num2);
                break;
            case(4):
                System.out.println(num1 / num2);
                break;
        }
    }
}
