package bir;

public class Main {
    public static void main(String[] args) {
   /* Player p1 = new Player("Berdan" , 1);
    p1.login();
    Player p2 = new Player("Ali",2);
    p2.login();
    Player p3 = new Player("Hasan" ,32);
    p3.login();
    System.out.println(Player.count);*/
        Course mat = new Course("Matematik" , "Mat101" , 70);
        Course fiz = new Course("Fizik" , "Fzk101" , 20);
        Course kim = new Course("Kimya" , "Kım101" , 100);
        int [] notlar = {mat.note,fiz.note,kim.note};
        //mat.calcAvarege(notlar); //Burada yazdığımız methodu kullanmak için bir nesneyi kullanmak zorunda kaldık

       // Calculate calc = new Calculate();
       // calc.calcAvarege(notlar); //Yine bir nesne kullandık ama bizim fonksiyonumuz nesneden bağımsız

        Calculate.calcAvarege(notlar); //İşte burada static kullandığımız için herhangi bir nesne üretmeden kullandık
    }
}
