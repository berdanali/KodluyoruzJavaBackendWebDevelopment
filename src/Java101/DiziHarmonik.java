public class DiziHarmonik {
    public static void main(String[] args) {
        double harmonik =0.0;
        int sum =0;
        int arr[] = {2,3,4,5};
        for(int i = 0 ; i < arr.length ; i ++){
            harmonik += (double) 1 /arr[i];
        }
        System.out.println("Java101.Harmonik ortalama : "  + arr.length/harmonik );

    }
}
