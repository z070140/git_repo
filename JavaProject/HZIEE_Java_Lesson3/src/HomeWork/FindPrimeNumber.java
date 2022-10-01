package HomeWork;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 2; i < n; i++) {
			int isPrime = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1) {
				System.out.print(i + " ");
			}
		}
	}

}
