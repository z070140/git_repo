//package my_first_java_project;

//import my_first_java_project.Scan;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(a + "" + b);
        System.out.println(Math.abs(a - b) < 1e-6);
        System.out.println(5 == 5.0);
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        System.out.println(amount);
        if (amount >= 10) System.out.println(amount - 10);

    }
}
