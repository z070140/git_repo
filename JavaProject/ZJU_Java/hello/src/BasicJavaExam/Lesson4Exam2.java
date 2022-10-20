package BasicJavaExam;

import java.util.Scanner;

public class Lesson4Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.close();
		int c = 0;
		int[] newnumber = new int[100];
		if (number < 0) {
			System.out.print("fu ");
		}
		number = Math.abs(number);
		for (int i = 0; i <= 4; i++) {

			while (true) {
				c = number % 10;
				newnumber[i] = c;
//				if (c == 1) {
//					System.out.print("yi ");
//				}
//				if (c == 2) {
//					System.out.print("er ");
//				}
//				if (c == 3) {
//					System.out.print("san ");
//				}
//				if (c == 4) {
//					System.out.print("si ");
//				}
//				if (c == 5) {
//					System.out.print("wu ");
//				}
//				if (c == 6) {
//					System.out.print("liu ");
//				}
//				if (c == 7) {
//					System.out.print("qi ");
//				}
//				if (c == 8) {
//					System.out.print("ba ");
//				}
//				if (c == 9) {
//					System.out.print("jiu ");
//				}
////				if (c == 0) {
////					System.out.print("ling ");
////				}
				// System.out.println(c);
				number = number / 10;
				if (number / 10 == 0 && number % 10 == 0) {
					break;
				}
			}
			// newnumber[i + 1] = c;

		}
		// number = number % 10;
		for (int i = 0; i <= 4; i++) {
			// System.out.println(newnumber[i]);
			if (newnumber[i] == 1) {
				System.out.print("yi");
			}
			if (newnumber[i] == 2) {
				System.out.print("er");
			}
			if (newnumber[i] == 3) {
				System.out.print("san");
			}
			if (newnumber[i] == 4) {
				System.out.print("si");
			}
			if (newnumber[i] == 5) {
				System.out.print("wu");
			}
			if (newnumber[i] == 6) {
				System.out.print("liu");
			}
			if (newnumber[i] == 7) {
				System.out.print("qi");
			}
			if (newnumber[i] == 8) {
				System.out.print("ba");
			}
			if (newnumber[i] == 9) {
				System.out.print("jiu");
			}
			if (newnumber[i] == 0) {
				System.out.print("ling");
			}
		}
		// System.out.print(number);
//		while (number / 10 != 0) {
//			c = number % 10;
//			newnumber = 10 * newnumber + c;
//			number = number / 10;
//		} // while (number / 10 != 0);
		// System.out.println(newnumber);
	}

}
