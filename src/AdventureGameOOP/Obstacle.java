public class Obstacle {
    private String name;
    private int id;
    private int demage;
    private int health;
    private int award;
    private int defaultHealth;


    public Obstacle(String name, int id, int demage, int health, int award) {
        this.name=name;
        this.id = id;
        this.demage = demage;
        this.health = health;
        this.award=award;
        this.defaultHealth= health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getHealth() {
        return health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health=health;
    }
}

