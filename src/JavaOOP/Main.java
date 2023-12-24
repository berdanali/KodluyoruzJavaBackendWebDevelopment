package JavaOOP;

public class Main {
    // Encapsulation example
    public class Kitap {
        private int sayfaSayisi;
        private String kitapAdi, yazar;
        Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
            this.kitapAdi = kitapAdi;
            this.yazar = yazar;
        }
        public int getSayfaSayisi() {
            return this.sayfaSayisi;
        }
        public void setSayfaSayisi(int sayfaSayisi) {
            if (sayfaSayisi < 1) {
                this.sayfaSayisi = 10;
            } else {
                this.sayfaSayisi = sayfaSayisi;
            }
        }
    }
}
