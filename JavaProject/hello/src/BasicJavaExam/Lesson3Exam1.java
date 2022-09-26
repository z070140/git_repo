package BasicJavaExam;

import java.util.Scanner;

import hello.count;

public class Lesson3Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0,ocount=0;
		System.out.println((int)4+""+(int)2);
		System.out.println((int)(char)(4));
		System.out.println((int)(char)2);
		System.out.println((int)' ');
		char i = ' ';
		System.out.println();
		while (true){
			int x  = in.nextInt();
			if (x==-1) {
				break;
			}
			if (x%2==0) {
				ocount ++;
			}
			if (x%2!=0) {
				count ++;
			}
		}
		System.out.print(count);
		System.out.print(' ');
		System.out.print(ocount);
		
	}

}
