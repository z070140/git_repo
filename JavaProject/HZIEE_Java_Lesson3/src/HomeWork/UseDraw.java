package HomeWork;

import java.util.Scanner;

public class UseDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n % 2 == 0 || n <= 0) {
			// System.out.println("Please reenter your number");
			n = in.nextInt();
		}
		// System.out.println(n);
		int sum = n / 2 + 1;

		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= (n - (2 * i - 1)); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.print("\n");

		}
		for (int i = sum - 1; i >= 1; i--) {
			for (int j = 1; j <= (n - (2 * i - 1)); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.print("\n");

		}

	}

}

/*
 * n=3,sum=2, for i = i;i<=sum;i++ 2i-1 = 1 2i-1 = 3 n -2 * (sum-1)
 * 
 */