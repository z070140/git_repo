package lesson4;

import java.util.Scanner;

public class Statistics_occur {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		//冒泡排序（从小到大）
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int b=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=b;
				}
			}
		}
		int digit=-1;
		int num=0;
		for(int i=0;i<N;i++) {
//			System.out.println("第"+(i+1)+"次运行循环");
			if(i==0) {
//				System.out.println("检测为第一位，初始赋值");
				digit=arr[i];
				num=1;
			}else if(digit==arr[i]&&i!=(N-1)) {
//				System.out.println("检测到与上一位相同，num相加");
				num++;
			}else if(digit!=arr[i]&&i!=(N-1)) {
//				System.out.println("检测到与上一位不同，输出最终答案，并初始化");
				System.out.println(digit+" "+num);
				digit=arr[i];
				num=1;
			}else if(digit==arr[i]&&i==(N-1)) {
				num++;
				System.out.println(digit+" "+num);
			}else if(digit!=arr[i]&&i==(N-1)) {
				System.out.println(digit+" "+num);
				System.out.println(arr[i]+" 1");
				
			}
			
			
			
		}
		//遍历数组
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
	}

}
