/*
 0 + 1 = 1
 1 + 1 = 2
 1 + 2 = 3
 2 + 3 = 5
 3 + 5 = 8
 5 + 8 = 13
 13 + 8 = 21
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int input;
        System.out.println("Kaç elemanlı fibonacci dizisi görmek istiyorsunuz ");
        input = k.nextInt();
        int a = 1, b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 2; i <= input; i++) {
            int top = a + b;
            a = b;
            b = top;
            System.out.println(top);
        }
    }
}
