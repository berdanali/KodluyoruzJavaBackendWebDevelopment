import java.util.Scanner;
import java.util.Arrays;
public class DiziSiralama {
    public static void main(String[] args) {
        int number;
        Scanner k = new Scanner(System.in);
        System.out.println("Lütfen dizi boyutunu giriniz ... ");
        int size = k.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". sayıyı giriniz : ");
            arr[i] = k.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        for (int eleman : arr) {
            System.out.print(eleman + " ");
        }
    }
}
