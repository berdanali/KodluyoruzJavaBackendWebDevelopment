import java.util.Scanner;

//C(n,r) = n! / (r! * (n-r)!)
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1,num2,total,comb1=1,comb2=1,comb3=1;
        System.out.println("Lütfen kombinasyonunu almak istediğiniz sayıları giriniz örneğin (5 4)");
        num1 = k.nextInt();
        num2 = k.nextInt();

        for(int i = 1 ; i <=num1 ; i++){
            comb1 = comb1 * i ;
        }

        for(int j = 1 ; j <=num2 ; j++){
            comb2 = comb2 * j ;
        }
        for(int l = 1 ; l <=num1-num2 ; l++){
            comb3 = comb3 * l ;
        }
        total= comb1 /(comb2 * comb3 );
        System.out.println("Girdiğiniz sayılarının kombinasyon sonucu : " + total);
    }
}
