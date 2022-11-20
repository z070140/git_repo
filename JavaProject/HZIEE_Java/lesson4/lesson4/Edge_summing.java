package lesson4;

import java.util.Scanner;

public class Edge_summing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=(sc.nextInt());
		int m=(sc.nextInt());
		int sum=0;
		//n行，m列
		int[][]arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
				if(i==0||i==n-1) {
					sum+=arr[i][j];
				}
			}
		}
		for(int i=1;i<n-1;i++) {
			sum+=(arr[i][0]+arr[i][m-1]);
		}
		System.out.println(sum);
	}

}
