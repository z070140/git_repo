package lesson4;

import java.util.Scanner;

public class Same_number {
	//第八题
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int m=sc.nextInt();
		int[]  date1=new int[m];
		for(int i=0;i<m;i++) {
			date1[i]=sc.nextInt();
			
		}
		int n=sc.nextInt();
		int[] date2=new int [n];
		for(int i=0;i<n;i++) {
			date2[i]=sc.nextInt();
			for(int j=0;j<m;j++) {
				if(date2[i]==date1[j]) {
					if(flag==1) {
						System.out.print(" "+date2[i]);
					}else if(flag==0){
						flag=1;
						System.out.print(date2[i]);
					}	
					
				}
			}
		}

	}

}
