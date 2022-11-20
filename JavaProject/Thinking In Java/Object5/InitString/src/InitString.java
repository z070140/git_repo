//: InitString/InitString.java

//class TestString{
//    String s1;
//    {
//        s1="Init String";
//    }
//}

public class InitString {
    public InitString() {
        System.out.println("Default s = " + s1);
    }

    public InitString(int i) {
        System.out.println("int s = " + s1);
    }

    String s1;

    {
        s1 = "Init String";
        System.out.println("Init...");
    }

    public static void main(String[] args) {
//        System.out.println(s1);
//        TestString testString = new TestString();
//        System.out.println(testString.s1);
        new InitString();
        new InitString(1);
    }


}
