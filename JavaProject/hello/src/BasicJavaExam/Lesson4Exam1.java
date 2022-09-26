package BasicJavaExam;

import java.util.Scanner;

public class Lesson4Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 1;
		int sum = 0;
		int[] Prime = new int[200];
		Prime[0] = 2;
		for (int i = 3; i <= 1223; i++) {
			int isPrime = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = 0;
					break;
				}

			}
			if (isPrime == 1) {
				// System.out.println(i + "是素数");
				Prime[count] = i;
				count++;
			}

		}
		// System.out.println(Prime[1]);
		for (int num = n; num <= m; num++) {
			sum = sum + Prime[num - 1];
		}
		System.out.println(sum);
	}
}
