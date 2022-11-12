//: Fibonacci/FibonacciRecursion.java
// Use recursion print Fibonacci.

import java.util.Scanner;

public class FibonacciRecursion {
    static int Fibonacci(int num) {
        if (num <= 2) {
            return 1;
        }
        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(Fibonacci(i) + " ");
        }
    }


}
