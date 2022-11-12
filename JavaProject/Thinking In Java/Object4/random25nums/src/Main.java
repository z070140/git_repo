//: random25nums/Main.java
// random 25 nums and compare.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random(47);
        int ran1 = rd.nextInt();
        for (int i = 1; i <= 24; i++) {
            int temp = rd.nextInt();
            if (ran1 < temp) {
                System.out.println(ran1 + " < " + temp);
            } else if (ran1 == temp) {
                System.out.println(ran1 + " = " + temp);
            } else {
                System.out.println(ran1 + " > " + temp);
            }
            ran1 = temp;
        }
    }
}
