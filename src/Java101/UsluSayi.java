import java.util.Scanner;

// 2^4 = 2*2*2*2
public class UsluSayi {
    public static void main(String[] args) {
        int num , up , total = 1;
        Scanner k = new Scanner(System.in);
        System.out.println("Üssünü almak istediğiniz saıyı giriniz ... ");
        num = k.nextInt();
        System.out.println("Lütfen üs derecesini giriniz ... ");
        up = k.nextInt();

        for(int i = 1 ; i<=up ; i++){
            total *=num;
        }
        System.out.println(total);
    }
}
