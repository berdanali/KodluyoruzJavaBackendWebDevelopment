package Final;

public class calcPı {
    // Final anahtarı sabit tanımlama için kullanılır bir kez oluştuktan sonra ne olursa olsun değişmez
    public final double pi = 3.14;
    int r;
    calcPı(int r) {
        this.r = r;
    }
    public void calcArea(){
        double area = pi*this.r*this.r;
        System.out.println("Dairenin alanı : " + area);
    }
}
