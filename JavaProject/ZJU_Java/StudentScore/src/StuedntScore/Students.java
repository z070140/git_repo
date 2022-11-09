package StuedntScore;

import java.util.ArrayList;
import java.util.HashMap;

class Lesson {

    private HashMap<String, Integer> lesson = new HashMap<String, Integer>();

    public void addSomeLesson(String lessonname, int socre) {       //  add 一对<课程,成绩>到哈希表中
        lesson.put(lessonname, socre);
    }

    public int getSomeLessonScore(String lessonname) {               // 获得某门课程的成绩
        return lesson.get(lessonname);
    }

    public HashMap getAllLesson() {                                  // 获得所有课程对<课程,成绩>
        return lesson;
    }


}


class Students {
    private HashMap<String, Lesson> students = new HashMap<String, Lesson>();

    /**
     * @param name       学生名字（唯一）
     * @param lessonname 课程名字（唯一）
     * @param score      成绩
     */
    public void setStudents(String name, String lessonname, int score) { // 设置某个学生的某门课程的成绩
        for (String s : students.keySet()) {
            if (s == name) {
                students.get(s).addSomeLesson(lessonname, score);
                return;
            }
        }
        Lesson a = new Lesson();
        a.addSomeLesson(lessonname, score);
        students.put(name, a);
    }

    public int getStudentSomeScore(String name, String lessonname) {  // 获得某个学生的某门课程的成绩
        return students.get(name).getSomeLessonScore(lessonname);
    }

    public HashMap getStudentAllScore(String name) {                     // 获得某个学生的所有课程的成绩
        return students.get(name).getAllLesson();
    }

    public void getLessonAllScore(String lessonname){                      // 获得某个课程的所有成绩
        for (String s: students.keySet()){
            System.out.print(s+": ");
            for (int i =0;i<students.get(s).getAllLesson().keySet().size();i++){
                if( lessonname== students.get(s).getAllLesson().keySet().toArray()[i]){
                    System.out.println(students.get(s).getAllLesson().get(lessonname));
                }
            }

        }

    }


    public static void main(String[] args) {
        Students students = new Students();
        students.setStudents("学生1", "数学", 80);
        students.setStudents("学生1", "语文", 60);
        System.out.println(students.getStudentAllScore("学生1"));
        students.setStudents("学生2", "数学", 90);
        students.setStudents("学生2", "语文", 100);
        System.out.println(students.getStudentAllScore("学生2"));
        System.out.println(students.getStudentAllScore("学生1"));
        System.out.println("--------");
        students.getLessonAllScore("数学");
    }

}

