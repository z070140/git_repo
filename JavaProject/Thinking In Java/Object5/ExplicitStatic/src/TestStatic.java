//: TestStatic.java


//class Test {
//    static String s1;
//    static String s2;
//
//    static {
//        s2 = "test";
//    }
//
//    static void Show() {
//        System.out.println(s1 + ":" + s2);
//
//    }
//
//    Test() {
//        System.out.println("Init");
//    }
//}

public class TestStatic {
    static String s1;
    static String s2;

    static {
        s2 = "This is s2";
    }

    public static void main(String[] args) {
//        System.out.println("Inside main()");
//        Test test = new Test();

        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);

    }
} /* Output
s1= null
s2= This is s2
*///:~
