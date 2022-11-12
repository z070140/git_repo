//: TossCoin/TossCoin.java
// TossCoin

import java.util.Random;

public class TossCoin {
    public static void main(String[] args) {
        Random rd = new Random(47);
        int a = rd.nextInt(2);
        System.out.println(a);
        if (a == 0) {
            System.out.println("back");
        } else {
            System.out.println("font");
//        boolean test = true;
//        String s = (String)test;
//        System.out.printf("%s",test);
        }
    }
} /* Output:
1
font
*///~
