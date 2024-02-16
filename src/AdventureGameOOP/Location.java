public abstract class Location extends Game{
    private Player player;
    private String name;

    public Location(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }



}
