import java.sql.SQLOutput;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" $ Mağzaya hoşgeldiniz $ ");
        boolean showMenu = true;
        while(showMenu){
            System.out.println("1-) Silahlar ");
            System.out.println("2-) Zırhlar ");
            System.out.println("3-) Çıkış ");
            System.out.println(" Seçiminiz : ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Seçtiğiniz değer geçersiz lütfen tekrar giriniz ... ");
                selectCase = Location.input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Birdaha bekleriz ");
                    showMenu=false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------Silahlar : ---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + " <Para : " + w.getPrice() + " Hasar: " + w.getDamage());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyWeapon(){
        System.out.println("Lütfen bir silah seçiniz");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Seçtiğiniz değer geçersiz lütfen tekrar giriniz ... ");
            selectWeaponID = input.nextInt();
        }
        if(selectWeaponID !=0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktır ");
                } else {
                    System.out.println(selectedWeapon.getName() + " Silahını seçtiniz ");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }

    }

    public void printArmor() {
        System.out.println("---------Zırhlar : ---------");
        System.out.println();
        for (Armor a : Armor.armors()) {
            System.out.println(
                    a.getId() + " - " + a.getName() + " <Para : "
                            + a.getPrice() + " Zırh Değeri: " + a.getBlock());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyArmor() {
        System.out.println("Lütfen bir zırh seçiniz");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Seçtiğiniz değer geçersiz lütfen tekrar giriniz ... ");
            selectArmorID = input.nextInt();
        }
           if (selectArmorID!=0){
               Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
               if (selectedArmor != null) {
                   if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                       System.out.println("Yeterli paranız bulunmamaktır ");
                   } else {
                       System.out.println(selectedArmor.getName() + " Zırhını seçtiniz ");
                       int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                       this.getPlayer().setMoney(balance);
                       System.out.println("------------------------------------------------------------------------------");
                       System.out.println("Kalan paranız : " + this.getPlayer().getMoney());


                       this.getPlayer().getInventory().setArmor(selectedArmor);
                   }
               }
           }

    }
}
