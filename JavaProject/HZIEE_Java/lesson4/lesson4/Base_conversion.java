package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class Base_conversion {
	//第五题
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int before_num=sc.nextInt();
		ArrayList list=new ArrayList();
		while(before_num>1) {
			list.add(before_num%2);
			before_num/=2;
		}
		list.add(before_num);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}
//		list.forEach(System.out::print);

	}

}
