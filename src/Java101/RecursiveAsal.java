import java.util.Scanner;

public class RecursiveAsal {
    public static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 2) {
            return (sayi == 2);
        }
        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi) {
            return true;
        }
        return isAsal(sayi, bolen + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
}

