public class Inventory extends Player {
    private boolean water;
    private boolean food;
    private boolean fireword;
    private String weaponName;
    private String armorName;
    private int weaponDemage;
    private int armorDefance;

    public Inventory(int damage, int healthy, int money, String name, boolean water, boolean food, boolean fireword, String weaponName, String armorName, int weaponDemage, int armorDefance) {
        super(damage, healthy, money, name);

        this.water = water;
        this.food = food;
        this.fireword = fireword;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDemage = weaponDemage;
        this.armorDefance = armorDefance;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFireword() {
        return fireword;
    }

    public void setFireword(boolean fireword) {
        this.fireword = fireword;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDemage() {
        return weaponDemage;
    }

    public void setWeaponDemage(int weaponDemage) {
        this.weaponDemage = weaponDemage;
    }

    public int getArmorDefance() {
        return armorDefance;
    }

    public void setArmorDefance(int armorDefance) {
        this.armorDefance = armorDefance;
    }
}
