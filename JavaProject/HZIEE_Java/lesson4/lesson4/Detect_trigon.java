package lesson4;

import java.util.Scanner;

public class Detect_trigon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=(sc.nextInt());
		int[][]arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		boolean flag=true;
		for(int i=1;i<n;i++) {
//			System.out.println("外循环第"+i+"次");
			for(int j=0;j<i;j++) {
//				System.out.println("内循环第"+j+"次");
				if(arr[i][j]!=0) {
					flag=false;
					break;
				}
			}
			if(flag==false) {
				break;
			}
		}
		if(flag)System.out.println("Yes");
		else System.out.println("No");

	}

}
