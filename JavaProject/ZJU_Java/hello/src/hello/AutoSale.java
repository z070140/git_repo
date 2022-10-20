package hello;

import java.util.Scanner;

public class AutoSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("请投币:");
			int amout = in.nextInt();
			balance += amout;
			if (balance >= 10) {
				System.out.println("**************");
				System.out.println("*Java城际铁路专线 *");
				System.out.println("*  无指定座位票   *");
				System.out.println("*  票价：10元   *");
				System.out.println("**************");
				System.out.println("找零：" + (balance - 10) + "元");
				balance = 0;

			}

		}
	}

}
