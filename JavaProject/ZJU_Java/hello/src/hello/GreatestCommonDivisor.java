package hello;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		;
		int b = in.nextInt();
		int oa = a;
		int ob = b;
		// int i = 1;
		// int count = 1;
		int r = 0;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		System.out.println(oa + "和" + ob + "最大公约数是" + a);

//		for (; i <= a && i <= b; i++) {
//			if (a % i == 0 && b % i == 0) {
//				count = i;
//			}
//
//		}
//		System.out.println(a + "和" + b + "最大公约数是" + count);
	}

}
