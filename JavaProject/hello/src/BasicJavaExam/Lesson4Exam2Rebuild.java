package BasicJavaExam;

import java.util.Scanner;

public class Lesson4Exam2Rebuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int remainder = 0;
		int c = 0;
		if (number < 0) {
			System.out.print("fu ");
			number = -1 * number;
		}
		while (number != 0) {
//			c = number % 10;
//			if (c == 1) {
//				System.out.print("yi ");
//			}
//			if (c == 2) {
//				System.out.print("er ");
//			}
//			if (c == 3) {
//				System.out.print("san ");
//			}
//			if (c == 4) {
//				System.out.print("si ");
//			}
//			if (c == 5) {
//				System.out.print("wu ");
//			}
//			if (c == 6) {
//				System.out.print("liu ");
//			}
//			if (c == 7) {
//				System.out.print("qi ");
//			}
//			if (c == 8) {
//				System.out.print("ba ");
//			}
//			if (c == 9) {
//				System.out.print("jiu ");
//			}
//			if (c == 0) {
//				System.out.print("ling ");
//			}
			remainder = remainder * 10 + number % 10; // 获得个位
			number /= 10; // 缩进一位

		}
		int newnumber = 0;
		while (remainder != 0) {
			c = remainder % 10;
			if (c == 1) {
				System.out.print("yi ");
			}
			if (c == 2) {
				System.out.print("er ");
			}
			if (c == 3) {
				System.out.print("san ");
			}
			if (c == 4) {
				System.out.print("si ");
			}
			if (c == 5) {
				System.out.print("wu ");
			}
			if (c == 6) {
				System.out.print("liu ");
			}
			if (c == 7) {
				System.out.print("qi ");
			}
			if (c == 8) {
				System.out.print("ba ");
			}
			if (c == 9) {
				System.out.print("jiu ");
			}
			if (c == 0) {
				System.out.print("ling ");
			}
			newnumber = newnumber * 10 + remainder % 10; // 获得个位
			remainder /= 10; // 缩进一位

			// System.out.println(remainder);
		}

	}
}
