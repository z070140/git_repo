//: ArrayClassObj.java

import java.util.Random;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println(a.length);

        }
    }

