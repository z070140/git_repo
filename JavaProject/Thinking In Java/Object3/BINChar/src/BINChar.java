//: BINChar/BINChar.java
// Use BIN Print Char.
public class BINChar {

    static String toBIN(char c) {
        return Integer.toBinaryString(c);
    }

    public static void main(String[] args) {
        char c = 'A';
        System.out.println(toBIN(c));

//        boolean test = true;
//        test = !test;
//        System.out.println(test);
    }
} /* Output
1000001
*///:~
