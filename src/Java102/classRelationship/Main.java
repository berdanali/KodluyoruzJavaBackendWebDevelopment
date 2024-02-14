package classRelationship;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Berdan" , "ANNAK" , "1" , "Tunceli" ,100);
        Student st2 = new Student("Ali" , "Demir" , "2" , "Mersin" ,100);
        Student st3 = new Student("Hasan" , "Güçlü" , "3" , "Elazığ" ,90);
        st2.setNote(100);
        System.out.println(st2.getNote());
        Instructor teacher = new Instructor("Mahmut" ,"Özgür" , "Teacher");
        Course mat = new Course("Mat101" , "101",teacher);
        System.out.println(mat.getInstructor().getName()); //teacher.getName ile aynı bu duruma birleştirme denir. Course has a Instructor (Sınıfın bir öğretmeni vardır anlamında) Composition
        //Student[] stu = {st1,st2,st3};
        //System.out.println("Ortalama: " + mat.calcAvarege(stu));



    }
}
