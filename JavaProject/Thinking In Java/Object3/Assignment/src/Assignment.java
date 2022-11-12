//: Assignment
// Assignment with objects is a bit tricky.

class Show {
    float num;

}

public class Assignment {
    static  void f(Show y){
        y.num=0;
    }

    public static void main(String[] args) {

        Show show1 = new Show();
        Show show2 = new Show();
        show1.num = 27;
        show2.num = 47;
        System.out.println(show1.num + ":" + show2.num);
        show1 = show2;
        System.out.println(show1.num + ":" + show2.num);
        show1.num = 10;
        System.out.println(show1.num + ":" + show2.num);

        Show show3=new Show();
        show3.num=100;
        f(show3);
        System.out.println(show3.num);
    }
} /* Output:
1: 27.0:47.0
2: 47.0:47.0
3: 10.0:10.0
4: 0.0
*///:~
