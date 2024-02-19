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
            System.out.println("Savaş olacak");
        }
        return true;
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
