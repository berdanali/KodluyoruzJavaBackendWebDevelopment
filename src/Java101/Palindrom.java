// 404 10201
import java.util.Scanner;
public class Palindrom {

    static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length()-1;

        while (i<j){
           if(str.charAt(i) != str.charAt(j)){
               return false;
           }
           i++;
           j--;
        }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("kavaak"));
    }
}