package lesson4;

import java.util.Scanner;

public class reward {
	//第七题
	static int money=100;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  num;
		String[] villager= {"a","b","c","d","e"};
		int more=201;
		String flag="";
		double people=0;
		for(int i=0;i<5;i++) {
			num=sc.nextInt();
			if(Math.abs(100-num)<Math.abs(100-more)) {
				more=num;
				flag=villager[i];
				people=1.0;
			}
			else if(Math.abs(100-num)==Math.abs(100-more)) {
				people+=1.0;
				flag+=" "+villager[i];
			}
			
		}
		
		System.out.println(flag+" "+String.format("%.2f",100/people));
		
	
	}

}
