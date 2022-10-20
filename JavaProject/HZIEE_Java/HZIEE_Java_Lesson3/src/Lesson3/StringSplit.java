package Lesson3;

import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	String t1 = in.next();
	String t2 = in.next();
	String[] t3 =  t1.split(":");
	for (String t:t3) {
	    int h1 = Integer.parseInt(t);
	    System.out.print(h1+":");
	   
	}
	
    }

}
