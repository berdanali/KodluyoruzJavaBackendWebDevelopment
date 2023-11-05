import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String username="patika" , password= "dev123";
         int right=3 , select;
        int balance=1500;


         while (right >0){
             System.out.println("Lütfen kullanıcı adınızı giriniz ... ");
             username = k.nextLine();
             System.out.println("Lütfen parolanızı giriniz ... ");
             password = k.nextLine();
             if(username.equals("patika") && password.equals("dev123")){
                 System.out.println("Patika Bankasına hoşgeldiniz ... ");
                do {

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin :\n  " +
                            "1-) Para Yatırma\n  " +
                            "2-) Para Çekme\n " +
                            "3-) Bakiye Sorgulama\n " +
                            "4-) Çıkış Yapma ");
                    select =k.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutarı yazınız : ");
                            int price =k.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarını yazınız : ");
                            int pricee =k.nextInt();
                            if(pricee>balance){
                                System.out.println("Yetersiz bakiye");
                            }
                            else{
                                balance -=pricee;
                            }
                            break;
                        case 3:
                            System.out.println("Şuanki bakiyeniz : " + balance);
                            break;
                        case 4:
                            break;
                    }

                }
                while(select!=4);
                 System.out.println("Tekrar görüşmek üzere.");
                 break;
             }
             else{
                 right--;
                 System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                 if (right == 0) {
                     System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                 } else {
                     System.out.println("Kalan Hakkınız : " + right);
                 }
             }
         }
    }
}