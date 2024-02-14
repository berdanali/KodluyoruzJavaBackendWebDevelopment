package Inheritance;

public class guvenlikGorevlisi extends Memur{
    private String belge;

    public guvenlikGorevlisi(String departman, String mesai, String adsoyad, String telefon, String eposta, String belge) {
        super(departman, mesai, adsoyad, telefon, eposta);
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getAdsoyad() +" Adlı kişinin nöbeti başlamıştır.");
    }
}
