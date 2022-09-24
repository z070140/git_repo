package hello;

import java.util.Scanner;

public class VoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		//int n = 0;
		int[] numbers = new int[10];
		while (x != -1) {
			if (x>=0 && x <=9) {
				numbers[x]++;
				System.out.println("次数"+numbers[x]);
			}
			x= in.nextInt()
;		}
		for ( int i=0; i<numbers.length; i++ )
		{
		System.out.println(i+":"+numbers[i]);
		}
		//for (int i = 0;i<votes.length;i++) {
			
		}
	}


