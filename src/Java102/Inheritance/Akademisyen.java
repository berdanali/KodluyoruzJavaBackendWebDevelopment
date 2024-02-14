package Inheritance;

public abstract class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    //eğer bir sub class bir super classı extends ediyorsa kalıtım aldığı sınıfın constructor'unu içinde yazmak zorunda
    public Akademisyen(String adsoyad, String telefon , String eposta ,String bolum ,String unvan){
        super(adsoyad,telefon,eposta); //Sadece constructor içinde çalışır. Üst sınıfın constructor'unu çağırır
        this.bolum=bolum; // Önce super sonra diğerleri
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public abstract void derseGir(String dersSaati); //abstract tanımlama
    @Override //Method Overriding yapıldı
    public void giris(){
        System.out.println(this.getAdsoyad() + " a kapısından giriş yaptı");
    }
}
