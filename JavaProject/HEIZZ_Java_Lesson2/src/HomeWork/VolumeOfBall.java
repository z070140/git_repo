package HomeWork;

import java.util.Scanner;

public class VolumeOfBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		in.close();
		double v = 0;
		v = ((double) 4 / 3) * Math.PI * Math.pow(r, 3);
		System.out.printf("%.3f", v);
	}

}
