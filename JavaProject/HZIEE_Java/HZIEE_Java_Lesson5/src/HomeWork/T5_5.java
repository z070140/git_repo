package HomeWork;

public class T5_5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setProperties("21050101", "Zhangsan", 90.5f);
        System.out.printf("Student No: %s, Name: %s, Mark: %.1f",
                student.getStuno(), student.getName(), student.getMark());
    }

}

class Student{
    float Mark;
    String Stuno,Name;

    Student(){

    }

    public void setProperties(String Stuno,String Name,float Mark){
        this.Stuno =Stuno;
        this.Name= Name;
        this.Mark=Mark;
    }

    public String getStuno(){
        return Stuno;
    }
    public  String getName(){
        return Name;
    }
    public float getMark(){
        return Mark;
    }




}
