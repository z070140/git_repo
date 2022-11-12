//: random25nums/WhileRandom.java
// random  nums and compare.

import java.util.Random;

public class WhileRandom {
    public static void main(String[] args) {
        Random rd = new Random(47);
        int ran1 = rd.nextInt();
        while (true) {
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
