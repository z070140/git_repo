//: ScanCompareString/ScanCompareString.java
// ScanCompareString

import java.util.Scanner;

public class ScanCompareString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        System.out.println("==: "+s1.equals(s2));;
        System.out.println("!=: "+!s1.equals(s2));
        System.out.println("");

    }
}
