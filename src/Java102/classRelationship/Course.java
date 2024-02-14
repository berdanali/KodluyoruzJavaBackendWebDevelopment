package classRelationship;

public class Course {
    private String courseName;
    private String courseNote;
    private Instructor instructor;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course(String courseName, String courseNote, Instructor instructor){
        this.courseName=courseName;
        this.courseNote=courseNote;
        this.instructor=instructor;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseNote(){
        return courseNote;
    }
    public void setCourseNote(String courseNote){
        this.courseNote=courseNote;
    }

//Course uses a Student ( Course sınıfı Student sınıfına bağlıdır. Eğer Student sınıfından bir değişkeni kaldırırsak örn note
// bunu kaldırsak sınıflar arası ilişki olduğu için Course sınıfında hata alacagız )
    public double calcAvarege(Student[] students){
        Student st4 = new Student("Hüseyin" ,"Demir" , "4" ,"Adana" ,70);
        double avarege = 0.0;
        for (Student student : students) {
            avarege += student.getNote();

        }
        return avarege/ students.length;
    }
}
