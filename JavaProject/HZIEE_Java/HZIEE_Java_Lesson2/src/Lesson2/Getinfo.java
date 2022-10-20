package Lesson2;

import java.util.Scanner;
//import java.util.*;

public class Getinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入：");
		// String s;
		int sum = 0;
		int n1 = 0, n2 = 0;
		// s = in.nextLine();
		// System.out.println(s);
		//sum = in.nextInt();
		n1 = in.nextInt();
		n2 = in.nextInt();
		sum = n1 + n2;
		System.out.println("Sum:" + sum);
		in.close();
	}

}
