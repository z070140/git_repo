package hello;

import java.util.Scanner;

public class WhichbiggerAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		a[0] = 5;
		int[] b = a;
		System.out.println(a[0]);
		b[0] = 16;
		System.out.println(a[0]);
		System.out.println(b[0]);

	}

}
