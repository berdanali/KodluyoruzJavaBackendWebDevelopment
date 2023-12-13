import java.util.Arrays;

//Bir dizide tekrar eden çift sayıları bulma
public class TekrarEdenSayi {
    public static void main(String[] args) {
        // respect
        int[] array = {3, 335, 35, 546, 65, 5652, 5165, 5165, 25, 5, 52, 515, 15, 52959, 8, 8, 88, 8848, 88, 8};
        Arrays.sort(array);
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == array[i - 1] && array[i] % 2 == 0 && array[i] != array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
      }
    }
