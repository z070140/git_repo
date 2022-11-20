package lesson4;

import java.util.Scanner;

public class exchange_min_max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  x=sc.nextInt();
		int[]  num=new int[x];
		int max,min;
		int max_flag=0;
		int min_flag=0;
		for(int i=0;i<x;i++) {
			num[i]=sc.nextInt();
			if(num[max_flag]<num[i]) {
				max_flag=i;
			}
			if(num[min_flag]>num[i]) {
				min_flag=i;
			}
			
		}
		max=num[max_flag];
		min=num[min_flag];
		if(max_flag==0&&min_flag==x-1) {
			int b=num[x-1];
			num[x-1]=max;
			num[max_flag]=b;
		}else {
			if(num[x-1]==min) {
				min_flag=max_flag;
			}
			int b=num[x-1];
			num[x-1]=max;
			num[max_flag]=b;
	
			b=num[0];
			num[0]=min;
			num[min_flag]=b;
		}
			
			
			
//			b=min;
//			min=num[0];
//			num[0]=b;
		for (int i : num) {
			if( i==num[0])System.out.print(i);	
			else System.out.print(" "+i);
		}

	}

}
