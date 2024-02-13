package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Kitap harryPoter = new Kitap("HarryPoter",500 ,"Berdan");
        Kitap lotr = new Kitap("Lotr",1500 ,"ali");
        lotr.setSayfaSayisi(-122);
        System.out.println(lotr.getSayfaSayisi());
    }
}
