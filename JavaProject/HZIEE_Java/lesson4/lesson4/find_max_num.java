package lesson4 ;

import java.util.Scanner;

public class find_max_num {
	//第六题
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  x=sc.nextInt();
		int[]  num=new int[x];
		int max=-1;
		int flag=-1;
		for(int i=0;i<x;i++) {
			num[i]=sc.nextInt();
			if(max<num[i]) {
				max=num[i];
				flag=i;
			}
			
		}
		System.out.println(+max+" "+flag);
	
		

	}

}
