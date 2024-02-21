import java.util.Scanner;

public class Player extends Game{
    private int damage;
    private int health;
    private int defaultHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private final Scanner input = new Scanner(System.in);


    public Player(String name){
        this.name=name;
        this.inventory= new Inventory();
    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefaultHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());
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
                "Silahınız : " + this.getInventory().getWeapon().getName() +
                 "\t Zırhınız : " + this.getInventory().getArmor().getName()
                        + " \t Bloklama : " + this.getInventory().getArmor().getBlock()
                        + " \t Hasarınız : " + this.getTotalDamage()
                        + " \t Sağlığınız : " + this.getHealth()
                        + " \t Paranız : " + this.getMoney());
    }




    public int getDamage() {
        return damage;
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
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
    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
