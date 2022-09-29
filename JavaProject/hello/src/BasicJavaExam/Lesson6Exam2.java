package BasicJavaExam;

import java.util.Scanner;

public class Lesson6Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String gpsline = "$GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50";
		String[] splitline = gpsline.split("[$,\\*]");
		char compare = 'G';

		for (int i = 1; i < splitline.length - 2; i++) {
			for (int j = 1; j < splitline[i].length(); j++) {
				// if (splitline[i].charAt(j) != '\s' && splitline[i].charAt(j) != '\t') {
				// System.out.println(splitline[i]);
				compare = (char) (splitline[i].charAt(j) ^ compare);
				// }
				// System.out.println(compare);
			}

		}
		int com = (int) compare % 65536;
		System.out.println(Integer.toHexString(com));
		System.out.println(Integer.toHexString(compare));

		// if (compare==)

		System.out.println(splitline[splitline.length - 1]);
		System.out.println(0);
	}

}
