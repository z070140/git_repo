package hello;

import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double count = 0.0;
		int sign = 1;
		for (int i = 1; i <= n; i++, sign = -sign) {
			count = count + sign * (double) 1.0 / i;
		}
		System.out.printf("%.2f", count);
	}
}
