package StuedntScore;

import java.util.ArrayList;
import java.util.HashMap;


class Student {
    private String name;
    private ArrayList<HashMap> lesson = new ArrayList<HashMap>();  // 课程信息的数组 存放有<课程名字,成绩>
    private HashMap<String, ArrayList> student = new HashMap<String, ArrayList>();


    public void setName(String name) {
        this.name = name;
    }

    public void setLessonScore(String lessonName, double lessonScore) {
         HashMap<String, Double> lessonInfo = new HashMap<String, Double>();
        lessonInfo.put(lessonName, lessonScore);
        lesson.add(lessonInfo);
    }

    public void addLesson() {
        student.put(name,lesson);
    }

    public ArrayList getLesson(){
        return student.get(name);
    }


}

class StudentClass {
    private ArrayList<Student> Students = new ArrayList<Student>();

    public void setStudent(Student student) {
        Students.add(student);
    }

    public String getStudents() {
        return Students.toString();
    }
}


public class StudentScore {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("学生1");
        student.setLessonScore("数学",80);
        student.setLessonScore("语文",90);
        student.setLessonScore("英语",70);
        student.addLesson();
        System.out.println(student.getLesson());

    }
}
