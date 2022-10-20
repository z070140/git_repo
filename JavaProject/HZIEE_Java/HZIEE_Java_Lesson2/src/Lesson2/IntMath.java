package Lesson2;

import java.util.*;

public class IntMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println(num1 + "%" + num2 + "=" + num1 % num2);
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		// num1++;
		// ++num1;
		// --num2;
		// num2--;
		System.out.println("num1=" + num1++);
		System.out.println("num2=" + num2);
//		if (num1 === num2) {
//			
//		}
		in.close();
	}

}