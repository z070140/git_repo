class Base{
    void s1(){
        System.out.println("s1");
    }
    void s1(String s2){
        System.out.println("s2");
    }
    void s1(int s3){
        System.out.println("s3");
    }
}

class Down extends  Base{
    void s1(double s4){
        System.out.println("s4");
    }
}

public class E11 {
    public static void main(String[] args) {
        Down d = new Down();
        d.s1();
        d.s1(1);
        d.s1("1");
        d.s1(1.1);

    }


}
