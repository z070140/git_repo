package lesson4;

import java.util.Scanner;

public class Matrix_summing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=(sc.nextInt());
		int m=(sc.nextInt());
		//n行，m列
		int[][]arr_a=new int[n][m];
		int[][]arr_b=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr_a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr_b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int x=arr_a[i][j]+arr_b[i][j];
				if(j==0)System.out.print(x);
				if(j!=0)System.out.print(" "+x);
			}
			System.out.println("\n");
		}
	}

}
