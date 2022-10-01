package HomeWork;

import java.util.Scanner;

public class CountPositiveNegative0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] nums = new Integer[n];
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
			if (nums[i] > 0) {
				count0 = count0 + 1;
			}
			if (nums[i] == 0) {
				count1 = count1 + 1;
			}
			if (nums[i] < 0) {
				count2 = count2 + 1;
			}
		}
		System.out.println(count0 + " " + count2 + " " + count1);

	}

}
