package HomeWork;

import java.util.Scanner;

public class ElephantDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int s = in.nextInt();
		int v = h * s;
		if (20000 % v == 0) {
			System.out.println((20000 / v) + " pails");
		} else {
			System.out.println((20000 / v + 1) + " pails");
		}
	}

}
