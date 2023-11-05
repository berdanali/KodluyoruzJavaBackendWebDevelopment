package Java101;

import java.util.Scanner;
public class Sıralama {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int num1,num2,num3,max;
        System.out.println("Lütfen 3 tane sayı giriniz .... ");
        num1 = k.nextInt();
        num2 = k.nextInt();
        num3 = k.nextInt();
        if(num1>num2 && num1>num3 && num2>num3){
            System.out.println("Büyükten küçüğe göre sıralama : " + num1 + "-" + num2 + "-" + num3 );
        }
        else if(num2>num1 && num2>num3 && num1>num3){
            System.out.println("Büyükten küçüğe göre sıralama : " + num2 + "-" + num1 + "-" + num3 );
        }
        else if(num3>num2 && num3>num1 && num2>num1){
            System.out.println("Büyükten küçüğe göre sıralama : " + num3 + "-" + num2 + "-" + num1 );
        }
        else if(num3>num2 && num3>num1 && num1>num2){
            System.out.println("Büyükten küçüğe göre sıralama : " + num3 + "-" + num1 + "-" + num2 );
        }
        else if(num1>num2 && num1>num3 && num3>num2){
            System.out.println("Büyükten küçüğe göre sıralama : " + num1 + "-" + num3 + "-" + num2 );
        }
        else if(num2>num1 && num2>num3 && num3>num1){
            System.out.println("Büyükten küçüğe göre sıralama : " + num2 + "-" + num3 + "-" + num1 );
        }
    }
}
