package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class Joseph_ring {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int k=sc.nextInt();
		int num=t;
		int flag=0;
		for(int i=0;i<t;i++) {
			list.add(i+1);
//			System.out.println("列表赋初始值压入数字为："+list.get(i));
			
		}
		while(num>=1) {
			if(num==1) {
				System.out.println(list.get(0));
				break;
			}else {
				flag++;
				if(flag%k==0) {
//					System.out.println("此程序已运行到了第："+flag+"次，该数为："+list.get(0)+" 此次运行为"+k+"的倍数，执行删除操作");
					list.remove(0);
					num--;
				}else if(flag%k!=0) {
//					System.out.println("此程序已运行到了第："+flag+"次，该数为："+list.get(0)+" ，未检测到该数为"+k+"的倍数，不执行删除操作");
					int x=(int) list.get(0);
					list.remove(0);
					list.add(x);
				}
			}
		}
		
		
	}

}
