package BasicJavaExam;

import java.util.Scanner;

public class Lesson2Exam2SignReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//int s = n%10;
		
		switch(n%10)
		{
		case 1:
			System.out.print("Unreadable");
		case 2:
			System.out.print("Barely readable, occasional words distinguishable");
		case 3:
			System.out.print("Readable with considerable difficulty");
		case 4:
			System.out.print("Readable with practically no difficulty");
		case 5:
			System.out.print("Perfectly readable");
		}
		switch(n/10)
		{
		case 1:
			System.out.print("Faint signals, barely perceptible");
		case 2:
			System.out.print("Very weak signals");
		case 3:
			System.out.print("Weak signals");
		case 4:
			System.out.print("Fair signals");
		case 5:
			System.out.print("Fairly good signals");
		}
		
	}

}
