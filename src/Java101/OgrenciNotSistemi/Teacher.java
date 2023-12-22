package OgrenciNotSistemi;
/*
* Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : Teacher()*/
public class Teacher {
    String name,mpno,branch;
    Teacher(String name, String mpno,String branch){
        this.branch=branch;
        this.mpno=mpno;
        this.name=name;
    }
    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
    }
}
