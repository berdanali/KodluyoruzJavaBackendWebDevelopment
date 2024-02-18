import java.util.Scanner;

public abstract class Location{
    private Player player;
    private String name;
    public static Scanner input = new Scanner(System.in);  // her nesne üretildiğinde üretilmez
    public Location(Player player, String name){
        this.player=player;
        this.name=name;
    }
    public abstract boolean onLocation();

    public Player getPlayer(){
        return player;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }




}
