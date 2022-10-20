package Lesson2;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int score = in.nextInt();
		if (score >= 90) {
			System.out.println("优秀");
		} else if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 60 && score < 70) {
			System.out.println("中等");
		} else if (score < 60) {
			System.out.println("差");
		}

	}

}
