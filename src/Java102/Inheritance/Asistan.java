package Inheritance;

public abstract class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adsoyad , String telefon, String epota, String bolum, String unvan, String ofisSaati){
        super(adsoyad ,telefon,epota,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }
    public String getOfisSaati(){
        return this.ofisSaati;
    }
    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdsoyad() + " Adlı asistan quiz yaptı");
    }
}
