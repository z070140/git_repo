package hello;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		int number;
//		number = in.nextInt();
//		;
//		while (number != -1) {
//			sum += number;
//			count++;
//			number = in.nextInt();
//		}
		do {
			number = in.nextInt();
			if (number != -1) {
				sum += number;
				count++;
			}
		} while (number != -1);
		if (count > 0)
			// System.out.println(sum / (double)count);
			System.out.println((double) sum / count);
	}
}
