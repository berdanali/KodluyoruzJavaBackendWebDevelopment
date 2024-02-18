import java.sql.SQLOutput;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player){
        super(player , "Güvenli");
    }
    @Override
     public boolean onLocation(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Güvenli evdesiniz");
        System.out.println("Canınız yenilendi :)");
        return true;
    }
}
