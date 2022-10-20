package Lesson2;

import java.util.Scanner;

public class VipSplitIntPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入4位会员卡号：");
		int number = in.nextInt();
		int id = number;
		int num = 0;
		int count = 0;
		System.out.println("会员卡号是：" + id);
		for (int i = 3; i >= 0; i--) {
			num = number / (int) Math.pow(10, i);
			number %= (int) Math.pow(10, i);
			count = count + num;

			switch (i) {
			case 0: {
				System.out.print("个位数：" + num);
				break;
			}
			case 1: {
				System.out.print("十位数：" + num);
				break;
			}
			case 2: {
				System.out.print("百位数：" + num);
				break;
			}
			case 3: {
				System.out.print("千位数：" + num);
				break;
			}
			}

		}
		System.out.println("\n会员卡号" + id + "各位之和：" + count);
		if (count == 24) {
			System.out.println("会员卡号" + id + "的会员，您中奖了！奖品是MP3！");
		}

	}

}
