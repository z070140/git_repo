package HomeWork;

import java.util.Scanner;

public class DrawByAsterisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n % 2 == 0 || n <= 0) {
			n = in.nextInt();
		}
		int sum = n / 2 + 1;
		for (int i = 1; i <= sum; i++) {
			for (int j = sum - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = sum - 1; i >= 1; i--) {
			for (int j = sum - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
