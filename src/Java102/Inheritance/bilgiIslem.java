package Inheritance;

public class bilgiIslem extends Memur{
    private String gorev;

    public bilgiIslem(String departman, String mesai, String adsoyad, String telefon, String eposta, String gorev) {
        super(departman, mesai, adsoyad, telefon, eposta);
        this.gorev = gorev;
    }
    public void networkKurulumu(){
        System.out.println(this.getAdsoyad() + " Adllı kişi network kurulumunu yapmıştır");
    }
}
