//: RecursionFactorial/RecursionFactorial.java
// Use Recursion Thinking Factorial  n! = ?

public class RecursionFactorial {
    static int Factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Factorial(n));
    }
} /* Output
12
*///:~
