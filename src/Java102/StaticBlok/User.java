package StaticBlok;

public class User {
    static
    {
        int random =(int) (Math.random() *10);
        System.out.println(random);
    }
    String name ;
    public static int count = 0;

    User(String name){
        this.name=name;
        count++;
    }

}
