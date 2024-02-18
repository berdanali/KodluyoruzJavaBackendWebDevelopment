import java.sql.SQLOutput;
import java.util.Scanner;

public class Player extends Game{
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private final Scanner input = new Scanner(System.in);


    public Player(String name){
        this.name=name;
        this.inventory= new Inventory();
    }

    public void selectChar(){
        GameChar[] charlist ={new Samurai(),new Archer(),new Knight()};
        System.out.println("------------------------------------------------------------------------------");
        for (GameChar gameChar:charlist) {
            System.out.println(
                    "İd : " + gameChar.getId() +
                    " \t Karekterler : " + gameChar.getName() +
                    " \t Hasar : " + gameChar.getDamage() +
                    " \t Sağlık: " + gameChar.getHealth() +
                    " \t Para : " + gameChar.getMoney());
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Lütfen devam etmek istediğiniz karakterin İD' sini seçin");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;

            default:
                initPlayer(new Samurai());
        }
        /*System.out.println(
                " Karekter : " + this.getName() +
                "\t Hasar : " + this.getDamage() +
                " Sağlık : " + this.getHealth() +
                " Para : " + this.getMoney());*/
        System.out.println("------------------------------------------------------------------------------");

    }
    public void printInfo(){
        System.out.println(
                "Silahınız : " + this.getInventory().getWeapon().getName()
                        + " \t Hasarınız : " + this.damage
                        + " \t Sağlığınız : " + this.health
                        + " \t Paranız : " + this.money);
    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());
    }


    public int getDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
