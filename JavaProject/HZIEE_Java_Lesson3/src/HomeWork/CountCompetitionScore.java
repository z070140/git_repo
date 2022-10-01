package HomeWork;

import java.util.Scanner;

public class CountCompetitionScore {

	static int Get_Max(int max, int[] scores, int n) {
		int maxnumber = 0;
		for (int i = 1; i < n; i++) {
			if (scores[i] > max) {
				max = scores[i];
				maxnumber = i;
			}
		}

		return maxnumber;
	}

	static int Get_Min(int min, int[] scores, int n) {
		int minnumber = 0;
		for (int i = 1; i < n; i++) {
			if (scores[i] < min) {
				min = scores[i];
				minnumber = i;
			}
		}

		return minnumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			scores[i] = in.nextInt();

		}
		int max = scores[0];
		int min = scores[0];
		int maxnumber = 0;
		int minnumber = 0;
		maxnumber = Get_Max(max, scores, n);
		minnumber = Get_Min(min, scores, n);
		int sum = 0;
		int average = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + scores[i];
		}
		sum = sum - scores[maxnumber] - scores[minnumber];
		average = sum / (n - 2);
		System.out.println(average);
	}

}
