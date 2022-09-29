package Lesson2;

import java.util.Scanner;

public class SwitchCaseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		switch (score / 10) {
		case 10: {

		}
		case 9: {
			System.out.println("A");
			break;
		}
		case 8: {
			System.out.println("B");
			break;
		}
		case 7: {
			System.out.println("C");
			break;
		}
		case 6: {
			System.out.println("D");
			break;
		}
		default: {
			System.out.println("E");
			break;
		}
		}
	}

}
