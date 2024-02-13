package Static;

public class Course {
    public String name;
    public String code;
    public int note;
    Course(String name,String code,int note){
        this.code=code;
        this.name=name;
        this.note=note;
    }
    /*public void calcAvarege(int[] notes){
        double total=0;
        for (int i: notes
             ) {
            total +=i;

        }
        double avarege = total/notes.length;
        System.out.println("Ortalamanız :"  + avarege);
    }*/
}
