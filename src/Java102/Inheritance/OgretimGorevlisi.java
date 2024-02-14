package Inheritance;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;
    public OgretimGorevlisi(String adsoyad , String telefon ,String eposta , String bolum, String unvan , String kapiNo){
        super(adsoyad, telefon, eposta, bolum, unvan);
        this.kapiNo =kapiNo;
    }
    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
}
