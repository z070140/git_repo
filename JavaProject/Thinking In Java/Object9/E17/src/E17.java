import java.util.Random;

interface E17_Interface {
    Random rand = new Random(47);

    int NUM = rand.nextInt(20);
}

class Test{
    private static int testNum=999;
    private String s = "Hello";
}

public class E17 extends Test implements E17_Interface {
//    String s
    public int getNUM() {
        return NUM;
    }
    public int getS(){
        return  testNum;
    }
//    E17(int num){
//
//        this.testNum=num;
//    }
//    public void setNUM(int num) {
//        NUM = num;
//    }



    public static void main(String[] args) {
//        E17 e = new E17(47);
//        System.out.println(Test.testNum);
        System.out.println(new E17().getNUM());
    }
}

