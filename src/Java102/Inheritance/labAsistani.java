package Inheritance;

public class labAsistani extends Asistan{
    public labAsistani(String adsoyad, String telefon, String eposta, String bolum, String unvan,String ofisSaati){
        super(adsoyad,telefon,eposta,bolum,unvan,ofisSaati);

    }
    public void lablaragir(){
        System.out.println(this.getAdsoyad() + " Adlı Lab Asistenı laba girmiştir.");
    }
}
