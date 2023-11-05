import java.util.Arrays;
public class Frekans {
    public static void main(String[] args) {
        //  Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
        int[] array =  {1, 23, 23, 3,5 ,4,45,4,32,23,4,78,10,10,3,3,3};
        int[] frekanslar = new int[array.length];
        int count =0;
        Arrays.sort(array);
        System.out.println("Dizi : "+Arrays.toString(array));
        for (int i = 1; i < array.length - 1; i++) {
            if (frekanslar[i] == -1) {
                // Bu eleman daha önce işlenmişse atla
                continue;
            }
            int frekans = 1;
            if (array[i] == array[i - 1] && array[i] != array[i + 1]) {
                System.out.print("Tekrar eden sayı : " + array[i] + " \n" + frekans+ " kez tekrar etmiştir ");
            }
        }
    }
}
