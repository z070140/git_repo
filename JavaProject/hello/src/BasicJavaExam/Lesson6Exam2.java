package BasicJavaExam;

import java.util.Scanner;

public class Lesson6Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			String gpsline = in.nextLine();
			if (gpsline.equals("END")) {
				break;
			}
			String[] splitline = gpsline.split("[$,\\*]");
			char compare = 'G';

			for (int i = 0; i <= splitline.length - 2; i++) {
				if (i == 1) {
					for (int j = 1; j < splitline[i].length(); j++) {
						compare = (char) (splitline[i].charAt(j) ^ compare);
						
					}
				} else {
					for (int j = 0; j < splitline[i].length(); j++) {

						compare = (char) (splitline[i].charAt(j) ^ compare);

						
					}
				}

			}
			int com = (int) compare % 65536;
			if ((Integer.toHexString(com)).equals(splitline[splitline.length - 1])) {
//				String time = splitline[2];
//				String[] splittime = time.split("\\.");
				String[] time = splitline[2].split("\\.");
				int nowtime = Integer.parseInt(time[0]);
				if (nowtime + 80000 >= 240000) {
					nowtime = nowtime + 80000 - 240000;
				} else {
					nowtime = nowtime + 80000;
				}
				for (int k = 5; k >= 0; k--) {
					System.out.print(nowtime / (int) Math.pow(10, k));
					nowtime = nowtime % (int) Math.pow(10, k);
					if (k==4||k==2) {
						System.out.print(":");
						
					}
				}
				System.out.print("\n");
			}
			

		}
	
	}

}
