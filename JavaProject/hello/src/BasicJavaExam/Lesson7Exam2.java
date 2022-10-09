package BasicJavaExam;

import java.util.Scanner;

public class Lesson7Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int is = 0;
		for (int i =n;i<=m;i++) {
			int count = 0;
			for (int j=1;j<i;j++) {
				if (i%j==0) {
					count+=j;
				}
			}
			if (count==i) {
				is = 1;
				System.out.print(count+" ");
			}
		}
		if (is ==0) {
			System.out.print("\n");
		}
	}

}
