package Lesson3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        score += in.nextInt();
        score += in.nextInt();
        float avg = score / 3.0f;
        System.out.printf("Average score is %06.2f", avg);
        in.close();

    }
}