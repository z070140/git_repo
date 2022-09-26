package BasicJavaExam;

import java.util.Scanner;

//import hello.count;

public class Lesson6Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = new String();
		// String line = new String();
		// int number = new int[];
		int count = 0;
		String[] temp;
		s = in.nextLine();
		temp = s.split(" ");
		// line = line + s;
		for (int i = 0; i < temp.length; i++) {
			if ((temp[i].substring(temp[i].length() - 1).equals("."))) {
				System.out.print(temp[i].length() - 1);
				break;
			}
			System.out.print(temp[i].length() + " ");

			// count = s.length();
			// System.out.print(s.length());
//		if ((s.substring(s.length() - 1).equals("."))) {
//			count = s.length() - 1;
//			
//
//		}
//		System.out.print(count);
		}

	}
}
