package HomeWork;

import java.util.Scanner;

public class T5_10 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	input.close();

	System.out.println("Average: " + MathUtil.average(a, b, c));

    }

}

class MathUtil {
//    public MathUtil() {
//	// TODO Auto-generated constructor stub
//    }

    static int average(double a, double b, double c) {
	int average;
	average = (int) (a + b + c) / 3;
	return average;
    }

    static int max(int a, int b, int c) {
	int max = a;
	if (max <= b) {
	    max = b;
	}
	if (max <= c) {
	    max = c;
	}

	return max;
    }

    static int min(int a, int b, int c) {
	int min = a;
	if (min >= b) {
	    min = b;
	}
	if (min >= c) {
	    min = c;
	}

	return min;
    }

    static int sum(int a, int b, int c) {
	int sum = a + b + c;
	return sum;
    }
}
