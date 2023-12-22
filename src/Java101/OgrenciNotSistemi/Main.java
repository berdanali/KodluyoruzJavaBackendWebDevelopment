package OgrenciNotSistemi;

/**
 * Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
 * Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.
 * Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
 * Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
 * Fizik Ortalaması : (90 * 0.20) + (60* 0.80);*/
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("berdan" , "12312412" , "TRH");
        Teacher t2 = new Teacher("mahmut" , "42132" , "FZK");
        Teacher t3 = new Teacher("ali" ,"213213", "BIO");
        Course tarih = new Course("Tarih" , "101" ,"TRH",90);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik" , "102" , "FZK",60);
        fizik.addTeacher(t2);
        Course bio =new Course("Biyoloji" , "202" ,"BIO",70);
        bio.addTeacher(t3);
        Student s1 = new Student("Şaban" , "123" , "4" ,tarih,fizik,bio);
        s1.addBulkExamNote(80,90,70);
        s1.isPass();
        Student s2 = new Student("Damat ferit" , "124" ,"4",tarih,fizik,bio);
        s2.addBulkExamNote(40,50,30);
        s2.isPass();
    }
}
