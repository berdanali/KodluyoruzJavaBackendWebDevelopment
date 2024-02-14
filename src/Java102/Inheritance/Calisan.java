package Inheritance;

public class Calisan {
    private String adsoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adsoyad, String telefon , String eposta){
        this.adsoyad=adsoyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
    public void giris(){
        System.out.println(this.adsoyad + " Üniversiteye giriş yaptı");
    }
    public void giris(double girisSaat){
        System.out.println(girisSaat + "Saatinde üniversiteye giriş yaptı ");
    }
    //Method Overloading yapılmıştır
    public void giris(double girisSaati , double cikisSaati){
        System.out.println(girisSaati + " Üniversiteye giriş yaptı ve " + cikisSaati + " Sattinde Üniversiteden çıkş yaptı");
    }
    public void cikis(){
        System.out.println(this.adsoyad + " Üniversiteden çıkış yaptı");
    }
    public void yemekhane(){
        System.out.println(this.adsoyad + " Yemekhaneye giriş yaptı");
    }
}
