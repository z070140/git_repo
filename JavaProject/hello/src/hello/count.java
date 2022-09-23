package hello;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x  = in.nextInt();
		int c = 0;
		do
		 {
			x /= 10;
			c += 1;
		}while (x>0);
		System.out.println(c);
	}

}
