package hello;

import java.util.Scanner;

public class ForControl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// int count = 0;
		int isPrime = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = 0;
				System.out.println(n + "不是素数");
				break;
			}
		}
		if (isPrime == 1) {
			System.out.println(n + "是素数");
		} else {
			System.out.println(n + "不是素数");
		}
//		for (int i = 1;i<=n;i++) {
//			if (n%i==0) {
//				count ++;
//			}
//		}
//		if (count==2) {
//			System.out.println(n+"是素数");
//		}
//		else {
//			System.out.println(n+"不是素数");
//		}

	}
}
//