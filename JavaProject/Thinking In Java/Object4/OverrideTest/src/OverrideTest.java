//: OverrideTest/OverrideTest.java
// use return Override Test.
public class OverrideTest {
    static boolean test(int testVal, int begin, int end) {
        if (testVal <= end && testVal >= begin) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 10));
    }

} /* Output
true
*///:~
