import java.util.Scanner;

//C(n,r) = n! / (r! * (n-r)!)
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;
        int factorialOfn = 1, factorialOfr = 1, factorialOfn_r = 1;

        do {
            System.out.print("Enter n value : ");
            n = inp.nextInt();
            System.out.print("Enter r value : ");
            r = inp.nextInt();

            if (r > n) {
                System.out.println("n must be greater than or equal to r.");
            }
        }
        while (r > n);

        for (int i = 1; i <= n; i++) {
            factorialOfn *= i;
            if (i <= r) {
                factorialOfr *= i;
            }
            if (i <= n - r) {
                factorialOfn_r *= i;
            }
        }
        int combination = factorialOfn / (factorialOfr * factorialOfn_r);
        System.out.println("Combination : " + combination);
    }
}