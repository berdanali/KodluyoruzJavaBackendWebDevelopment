package OgrenciNotSistemi;
/*,
* Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/
public class Student {
    Course c1,c2,c3;
    String name,stuNo,classes;
    boolean isPass;
    double avarange,courseAvarangeTarih,courseAvarangeFizik,courseAvarangeBiyyoloji;
    Student(String name, String stuNo, String classes, Course c1 ,Course c2 , Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3= c3;
        this.avarange=0.0;
        this.courseAvarangeTarih=0.0;
        this.courseAvarangeFizik=0.0;
        this.courseAvarangeBiyyoloji=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2 >= 0 && note2<=100){
            this.c2.note=note2;
        }
        if(note3 >= 0 && note3<=100){
            this.c3.note=note3;
        }
    }
    void isPass(){
        System.out.println("*******************************");
        if(c1.name.equals("Tarih")){
            this.courseAvarangeTarih=c1.note*0.6 + c1.sozluNotu*0.4;
        }
        if(c2.name.equals("Fizik")){
            this.courseAvarangeFizik=c2.note*0.7 + c2.sozluNotu*0.3;
        }
         if(c3.name.equals("Biyoloji")){
             this.courseAvarangeBiyyoloji=c3.note*0.8 + c3.sozluNotu*0.2;
         }
        this.avarange=(this.courseAvarangeTarih+this.courseAvarangeFizik+this.courseAvarangeBiyyoloji)/3.0;
        if(this.avarange>50){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz ...");
            System.out.println("Derslerinizin ortalaması \n" + "TARİH : " + courseAvarangeTarih +  "FİZİK: " + courseAvarangeFizik + " BİYOLOJİ" + courseAvarangeBiyyoloji );
            this.isPass=true;
        }
        else{
            System.out.println("Maalesef sınıfta kaldınız ");
            this.isPass=false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name+ " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name+ " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name+ " Notu\t:" + this.c3.note);
        System.out.println("Ortalamanız : " + this.avarange);
    }
}