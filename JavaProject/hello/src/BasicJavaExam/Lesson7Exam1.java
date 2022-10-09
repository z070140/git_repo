package BasicJavaExam;

import java.util.Scanner;

public class Lesson7Exam1 {

	public static int Prime(int num) { // 求出小于等于num的所有素数个数
		int count = 1;

		for (int i = 3; i <= num; i++) {
			int isPrime = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1) {
				count = count + 1;
			}
		}
		return count;

	}

	public static int[] Primes(int num, int count) { // 求出小于等于num的所有素数
		int[] Primes = new int[count];
		int k = 1;
		Primes[0] = 2;
		for (int i = 3; i <= num; i++) {
			int isPrime = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1) {
				Primes[k] = i;
				k++;
			}
		}
		return Primes;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num > 100000 || num < 2) {
			System.out.println("Error input");
		}
		int oanum = num;
		int isPrime = 1;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = 0;
				break;
			}
		}
		if (isPrime == 1) {
			System.out.println(num + "=" + num);
		}
		if (isPrime == 0) {
			count = Prime(num);
			// System.out.println(count);
			int[] Primes = new int[count];
			Primes = Primes(num, count);
			int[] number = new int[count];
			int n = 0;
			while (num != 0 && num != 1) {
				for (int k = 0; k < count; k++) {
					if (num % Primes[k] == 0) {
						number[n] = Primes[k];
						num = num / Primes[k];
						n++;
						break;
					}
				}
			}
			System.out.print(oanum + "=");
			for (int j = 0; j < n - 1; j++) {
				System.out.print(number[j] + "*");

			}
			System.out.print(number[n - 1]);
		}
	}

}
