package OgrenciNotSistemi;
/*,
* Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/
public class Student {
    Course c1,c2,c3;
    String name,stuNo,classes;
    boolean isPass;
    double avarange;
    Student(String name, String stuNo, String classes, Course c1 ,Course c2 , Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3= c3;
        this.avarange=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1 , int note2,int note3){
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
        this.avarange=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarange>50){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz ...");
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
