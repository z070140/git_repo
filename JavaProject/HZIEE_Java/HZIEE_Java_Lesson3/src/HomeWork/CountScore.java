package HomeWork;

import java.util.Scanner;

public class CountScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		Integer[] scores = new Integer[10];
		int average = 0;
		int all = 0;
		int gg = 0;
		for (int i = 0; i < 10; i++) {
			scores[i] = in.nextInt();
			all = all + scores[i];
			if (scores[i] < 60) {
				gg = gg + 1;
			}
		}
		average = all / 10;
		System.out.println(average + " " + gg);
	}

}
