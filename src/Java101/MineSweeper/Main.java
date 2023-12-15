package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("Mayın tarlası oyununa hoşgeldiniz ");
        System.out.println("Lütfen oynamak istediğiniz boyutlar giriniz ");
        System.out.println("Satır sayısı :");
        row = scan.nextInt();
        System.out.println("Sutun sayısı : ");
        column=scan.nextInt();
        MineSweeper mayin = new MineSweeper(row,column);
        mayin.run();


    }
}
