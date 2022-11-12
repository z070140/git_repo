//: StringInit.java
// Test Init and NoInit .

class NoInitString {
    String a;
}

class InitString {
    String a = new String();

    InitString() {
        a = new String();
    }
}

public class StringInit {

    public static void main(String[] args) {
        NoInitString noInitString = new NoInitString();
        System.out.println(noInitString.a);
        try {
            System.out.println(noInitString.a.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        InitString initString = new InitString();
        System.out.println(initString.a);
        System.out.println(initString.a.length());
    }
} /* Output
null

0
java.lang.NullPointerException
	at StringInit.main(StringInit.java:21)
*///:~