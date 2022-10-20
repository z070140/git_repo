package HomeWork;

import java.util.Scanner;

public class FindNiceNum {

	static int nigidit(int num, int digit) {
		int count = 0;
		while (num != 0) {
			if (num % 10 == digit) {
				count = count + 1;
				num = num / 10;
			} else {
				num = num / 10;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] nums = new Integer[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		int max = 0;
		int show = 0;
		for (int i = 0; i < n; i++) {
			if (nigidit(nums[i], 8) > max) {
				max = nigidit(nums[i], 8);
				show = nums[i];
			}

		}
		if (max == 0) {
			System.out.println("No");
		} else {
			System.out.println(show);
		}
	}

}
