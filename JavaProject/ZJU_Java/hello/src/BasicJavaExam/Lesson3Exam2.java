package BasicJavaExam;

//import java.lang.FdLibm.Pow;
import java.util.Scanner;

//import javax.security.auth.x500.X500Principal;

//import hello.count;

//import hello.count;

public class Lesson3Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		// count = 0;
		int number;
		number = in.nextInt();
		int yushu = 0;
		int jieguo = 0;
		for (int i = 1; i <= 6; i++) {

			yushu = number % 10;
			number = number / 10;
			if ((yushu % 2 == 0 && i % 2 == 0) || (yushu % 2 == 1 && i % 2 == 1)) {
				count += (int) Math.pow(10, i - 1);

			}
			if (number / 10 == 0) {
				break;
			}

		}
		String s = String.valueOf(count);
		count = Integer.parseInt(s, 2);
		System.out.println(count);

//		int x = 0;
//		x = in.nextInt();
//		int jishu = 0, oushu = 0;
//		int[] shuzu = new int[6];
//		for (int i = 1; i <= 6; i++) {
//			int count = 0;
//			if (x / 2 != 0) {
//				if ((x % 2 != 0 && i % 2 != 0) || (x % 2 == 0 && i % 2 == 0)) {
//					count = 1;
//					shuzu[6 - i] = count;
//
//					// System.out.println(shuzu[5 - i]);
//				}
//				x /= 10;
//				// System.out.println(shuzu[6 - i]);
//
//			}
//		}
//		int all = 0;
//		for (int i = 1; i <= 6; i++) {
//			// System.out.print(shuzu[i]);
//			if (shuzu[6 - i] == 1) {
//				all = (int) (all + Math.pow(2, i));
//			}
//			
//		}
//		System.out.println(all);

	}

}
