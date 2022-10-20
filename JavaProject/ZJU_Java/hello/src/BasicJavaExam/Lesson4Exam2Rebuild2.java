package BasicJavaExam;

import java.util.Scanner;

public class Lesson4Exam2Rebuild2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.close();
		int c = 0;
		int newnumber = 0;
		int count = 0;
		while (number != 0) {
			c = number % 10;
			newnumber = newnumber + c * (int) Math.pow(10, count);
			number = number / 10;
			count++;
			// newnumber =
		}
		System.out.println(newnumber);
	}

}
