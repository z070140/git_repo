package Lesson4;

import java.util.Scanner;

public class Accumulation {

    public static int f(int n) {
        if (n == 1) {
            return n;
        }

        return f(n - 1) + n;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        sum = f(n);
        System.out.println(sum);
        in.close();
    }

}
