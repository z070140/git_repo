package Lesson3;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String name = in.next();
        int age = in.nextInt();
        in.close();

        // System.out.printf("Hello %s,You %s!\n", name, age>16? "bro" : "kid");
        System.out.printf("The value is %02f.\n", (double)age);

        System.out.printf("The value is '%10.2f.'\n", 5.0);
        System.out.printf("The value is '%10.2f.'\n", 12345.0);

    }
}
