package BasicJavaExam;

import java.util.Scanner;

public class Lesson6Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String gpsline = in.nextLine();
		String[] splitline = gpsline.split(",");
		String[] compare = splitline[0].split("$");
		for (int i = 0; i < splitline.length; i++) {
			compare[0] = splitline[i];
			
		}
		String[] s = gpsline.split("\\*");
		int number = Integer.parseInt(s[1]);
		// number = n
		
		System.out.println(number);
	}

}
