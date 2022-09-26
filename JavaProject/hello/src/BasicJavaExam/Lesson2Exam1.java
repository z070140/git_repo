package BasicJavaExam;

import java.util.Scanner;

public class Lesson2Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int hour;
		{
			if (x / 100 < 8) {
				hour = (x + 2400) - 800;
			} else
				hour = x - 800;
			System.out.println(hour);
		}
	}

}
