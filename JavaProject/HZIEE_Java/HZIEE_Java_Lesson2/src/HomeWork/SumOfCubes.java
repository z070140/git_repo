package HomeWork;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 0;
		in.close();
		while (number != 0) {
			sum = sum + (int) Math.pow(number % 10, 3);
			number /= 10;
		}
		System.out.println("result:" + sum);
	}

}
