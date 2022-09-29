package Lesson2;

import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your Java score");
		int Java_score = in.nextInt();
		System.out.println("Please enter your Music score");
		int Music_score = in.nextInt();
		if (Java_score > 90) {
			System.out.println("Well done!");

		} else if (Music_score < 80) {
			System.out.println("Work hard!");
		}
	}

}
