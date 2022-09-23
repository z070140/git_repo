//package my_first_java_project;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        x = (x-32)*5/9;
        System.out.println((int)x);
    }

}
