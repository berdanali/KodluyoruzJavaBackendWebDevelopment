/*
* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
* eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
*  şifreler aynı ise ekrana "Şifre oluşturulamadı,
* lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String username,password,answer,newpassword;
        System.out.println("Lüfen kullanıcı adını giriniz ... ");
        username = k.nextLine();
        System.out.println("Lütfen şifreyi giriniz ... ");
        password=k.nextLine();

        if(username.equals("patika") && password.equals("berdan")){
            System.out.println("Başırlı bir şekilde giriş yaptınız ... ");
        }
        else{
            System.out.println("Kullanıcı adını veya parolayı yalnış girdiniz, Şifreyi sıfırlamak isityor musunuz? ");
            System.out.println("evet hayır ");
            answer=k.nextLine();
            if(answer.equals("evet")){
                System.out.println("Lütfen yeni şifre giriniz ... ");
                newpassword=k.nextLine();

                if(password.equals(newpassword)) {
                    System.out.println("Yeni şifre ile eski şifre aynı olmaz, lütfen başka şifre giriniz ... ");
                }
                else{
                    System.out.println("Şifre oluşturuldu ... ");
                }


            }
            else {
                System.out.println("iyi Günler ... ");
            }
        }
    }



}
