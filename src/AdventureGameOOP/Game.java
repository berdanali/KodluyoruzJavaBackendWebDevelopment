import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    public void start(){
        Scanner input =new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz :) ");
        System.out.println("Lütfen değerli isminizi girin");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(player.getName() + " Macera oyununa hoşgeldin ... ");
        player.selectChar();
        Location location=null;
        while(true){
            player.printInfo();
            System.out.println();
            System.out.println("-------------- Bölgeler  --------------");
            System.out.println();
            System.out.println("1-) Güvenli ev  --> Burada düşman yok güvendesiniz bir süreliğine tabi :)");
            System.out.println("2-) Eşya Dükkanı  --> Buradan silah veya zırh alabilirsiniz ");
            System.out.println("3-) Mağara --> Dikkatli ol zombi çıkabilir :) Ödülün : *YEMEK*");
            System.out.println("4-) Orman --> Dikkatli ol vampir çıkabilir :) Ödülün : *ODUN*");
            System.out.println("5-) Nehir --> Dikkatli ol ayı çıkabilir :) Ödülün : *SU*");

            System.out.println("0-) Çıkış yap --> Oyunu sonlandır");
            System.out.println("Lütfen girmek istediğiniz bölgeyi seçiniz");
            int selectLocation = input.nextInt();
            switch (selectLocation){
                case 0:
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz ");
            }
            if(location==null){
                System.out.println("Oyun bitti yine bekleriz ");
                break;
            }
           if(!location.onLocation()){
               System.out.println(" GAME OVER !!! ");
               break;
           }
        }


    }
}
