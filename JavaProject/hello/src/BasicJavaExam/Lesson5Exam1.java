package BasicJavaExam;

import java.util.Scanner;

public class Lesson5Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] Polynomial1 = new int[7];
		int[] Polynomial2 = new int[7];

		while (true) {
			int i = in.nextInt();
			int j = in.nextInt();
			Polynomial1[i] = j;
			if (i == 0) {
				break;
			}
		}
		while (true) {
			int i = in.nextInt();
			int j = in.nextInt();
			Polynomial2[i] = j;
			if (i == 0) {
				break;
			}
		}
		int[] Polunomail3 = new int[7];
		for (int i = 6; i >= 0; i--) {
			Polunomail3[i] = Polynomial1[i] + Polynomial2[i];
		}
		for (int j = 6; j >= 0; j--) {
			if (j == 0) {
				System.out.print(Polunomail3[j] + j);
			} else if (Polunomail3[j] == 0) {

			} else if ((j == 1)) {
				System.out.print(Polunomail3[j] + "x" + "+");
			}

			else if ((j != 0) && (j != 1) && (Polunomail3[j] != 0)) {
				System.out.print(Polunomail3[j] + "x" + j + "+");
			}
		}

		// in.close();
	}

}
