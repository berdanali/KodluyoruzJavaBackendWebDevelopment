import java.util.Scanner;
public class MethotOlusturma {
    public static void recursiveIslem(int sayi) {
        if (sayi <= 0) {
            System.out.println("Son değer: " + sayi);
            return;
        }
        System.out.println("Çıkartma işlemi: " + sayi);
        recursiveIslem(sayi - 5);
        System.out.println("Toplama işlemi: " + sayi);
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int sayi = input.nextInt();
            recursiveIslem(sayi);
        }

    }


