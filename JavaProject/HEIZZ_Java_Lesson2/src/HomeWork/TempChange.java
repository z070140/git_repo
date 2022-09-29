package HomeWork;

import java.util.Scanner;

public class TempChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double temp = in.nextDouble();
		in.close();
		temp = ((double) 9 / 5) * temp + 32;
		System.out.printf("%.2f", temp);
	}

}
