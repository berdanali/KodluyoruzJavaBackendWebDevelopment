import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLocation(Player player, String name,Obstacle obstacle, String award, int maxObstacle){
        super(player,name);
        this.award=award;
        this.obstacle=obstacle;
        this.maxObstacle=maxObstacle;
    }
    @Override
    public boolean onLocation(){
        int obsNumber= this.randomObstacleNumber();
        System.out.println(" Şuanda buradasınız \t " + this.getName());
        System.out.println(" Dikkatli ol ! Burada" + obsNumber + " tane " + this.getObstacle().getName() + " Yaşıyor ");
        System.out.print("<S>avaş veya <K>aç");
        String selectCase=input.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("S")){
            if(combat(obsNumber)){
                System.out.println(this.getName() + " Bulunan tüm düşanları yendiniz :))");
                return true;
            }
        }
        if(this.getPlayer().getHealth() <=0){
            System.out.println(" YOU DİE ");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getDefaultHealth());
            playerStats();
            obstacleStats(i);
            while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() >0){
                System.out.println("----<V>ur veya <K>aç----");
                String selectKombat =input.nextLine().toUpperCase();
                if(selectKombat.equals("V")){
                    System.out.println("Siz vurdunuz");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealth()>0){
                        System.out.println();
                        System.out.println("Canvar size vurdu :((");
                        int obstacleDamage = this.getObstacle().getDemage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage < 0){
                            obstacleDamage=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                else{
                    return false;
                }
            }
            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Canavari yendiniz :))");
                System.out.println(this.getObstacle().getAward() + " Dolar Kazandınız ");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız :" + this.getPlayer().getMoney());
            }
            else{
                return  false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Bizim canımız : " + this.getPlayer().getHealth());
        System.out.println( this.getObstacle().getName() + "'ın canı : " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStats(){
        System.out.println("Oyuncu değerleri :");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama :" + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        if(this.getPlayer().getInventory().getWeapon().getDamage() > 0){
            System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
        }

    }

    public void obstacleStats(int i){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri ");
        System.out.println(this.getObstacle().getName() + " Değerleri: ");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDemage());
        System.out.println("Kelle Ödülü : " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber(){
        Random r =new Random();
        return r.nextInt(this.maxObstacle)+1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }


}
