import java.sql.SQLOutput;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player){
        super(player, "Mağaza");
    }
    @Override
    public boolean onLocation(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" $ Mağzaya hoşgeldiniz $ ");
        System.out.println("1-) Silahlar ");
        System.out.println("2-) Zırhlar ");
        System.out.println("3-) Çıkış ");
        System.out.println(" Seçiminiz : ");
        int selectCase=Location.input.nextInt();
        while(selectCase <1 || selectCase>3){
            System.out.println("Seçtiğiniz değer geçersiz lütfen tekrar giriniz ... ");
            selectCase=Location.input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Birdaha bekleriz ");
                return true;
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("---------Silahlar : ---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + " <Para : " + w.getPrice() + " Hasar: " + w.getDamage());
        }
        System.out.println("Lütfen bir silah seçiniz");
        int selectWeaponID = input.nextInt();
        while(selectWeaponID<1 || selectWeaponID> Weapon.weapons().length){
            System.out.println("Seçtiğiniz değer geçersiz lütfen tekrar giriniz ... ");
            selectWeaponID = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
        if (selectedWeapon != null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yeterli paranız bulunmamaktır ");
            }
            else {
                System.out.println(selectedWeapon.getName() + "Silahını seçtiniz ");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Kalan paranız : " + this.getPlayer().getMoney()  );

                System.out.println("Önceki silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Yeni silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }
    public void buyWeapon(){

    }
    public void printArmor(){

    }

}
