public class Obstacle {
    private String name;
    private int id;
    private int demage;
    private int health;


    public Obstacle(String name, int id, int demage, int health) {
        this.name=name;
        this.id = id;
        this.demage = demage;
        this.health = health;
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

    public void setHealth(int health) {
        this.health = health;
    }
}
