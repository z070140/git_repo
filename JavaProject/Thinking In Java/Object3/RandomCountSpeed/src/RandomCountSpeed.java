//: RandomCountSpeed/RandomCountSpeed.java
// Count Speed: s/t.

import java.util.Random;

public class RandomCountSpeed {

    public static  void main(String[] args){
        Random random = new Random(47);
        double s = random.nextDouble();
        double t = random.nextDouble();

        System.out.println("Speed: "+s/t);

    }
} /* Output:
Speed: 1.3694736152095621
*///~
