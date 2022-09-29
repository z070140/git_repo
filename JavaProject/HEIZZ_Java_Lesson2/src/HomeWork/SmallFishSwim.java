package HomeWork;

import java.util.Scanner;

public class SmallFishSwim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String start = new String();
		String end = new String();
		start = in.nextLine();
		end = in.nextLine();
		String[] starttime = start.split(":");
		String[] endtime = end.split(":");
		Integer[] time = { 0, 0 };
		if (Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]) < 0) {
			time[1] = 60 + Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]);
			time[0] = Integer.parseInt(endtime[0]) - Integer.parseInt(starttime[0]) - 1;
		} else {
			time[0] = Integer.parseInt(endtime[0]) - Integer.parseInt(starttime[0]);
			time[1] = Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]);
		}

		System.out.println(time[0] + "h" + time[1] + "m");
	}

}
