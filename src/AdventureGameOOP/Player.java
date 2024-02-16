import java.sql.SQLOutput;
import java.util.Scanner;

public class Player extends Game{
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private Inventory inventory;


    public Player(int damage, int healthy, int money, String name){
        this.damage=damage;
        this.healthy=healthy;
        this.name=name;
        this.money=money;
    }
    public void selectChar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Macara oyununa hoşgeldiniz lütfen devam etmek istediğiniz karakteri seçin");
        System.out.println("*****************************");
        System.out.println("1. Okçu \n" +
                "2. Samuray \n" +
                "3. Şövalye ");
        int select = input.nextInt();
        switch (select) {
            case (1) -> System.out.println("Seçilen karekter: Okçu");
            case (2) -> System.out.println("Seçilen karakter: Samuray");
            case (3) -> System.out.println("Seçilen karekter: Şovalye");
            default -> System.out.println("Lütfen geçerli bir sayı giriniz !!!");
        }
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
