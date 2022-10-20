package hello;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		// int i = 1;
		int fator = 1;
//		while (i<=n)
//		{
//			fator *= i;
//			i += 1;
//			
//		}
		for (int i = 1; i <= n; i++) 
		{
			fator *= i;
		}
		System.out.println(fator);
	}
}
