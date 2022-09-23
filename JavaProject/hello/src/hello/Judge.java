package hello;

import java.util.Scanner;

public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		int z;
		int max;
		System.out.println("请输入三个数：");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if (x > y) {
			if (x > z) {
				max = x;
			} else {
				max = z;
			}
		} else {
			if (y > z) {
				max = y;
			} else {
				max = z;
			}
		}
		System.out.println(max);
	}
}
