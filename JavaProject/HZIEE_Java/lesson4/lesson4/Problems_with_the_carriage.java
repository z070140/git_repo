package lesson4;

import java.util.Scanner;

public class Problems_with_the_carriage {

	public static void main(String[] args) {
		//冒泡
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		int min=0;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int b=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=b;
					min++;
				}
			}
		}
		System.out.println(min);
		

	}

}
