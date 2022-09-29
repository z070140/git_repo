package HomeWork;

import java.util.Scanner;

public class BuyPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cash = in.nextInt();
		in.close();
		int sum = 0;
		while (cash / 5 != 0) {
			while (cash / 25 != 0) {

				while (cash / 100 != 0) {
					sum = sum + cash / 100 * 25;
					cash = cash - cash / 100 * 100;

				}
				sum = sum + cash / 25 * 6;
				cash = cash - cash / 25 * 25;

			}
			sum = sum + cash / 5;
			cash = cash - cash / 5 * 5;
		}

		System.out.println(sum);
	}

}
