//: PrimeNum/PrimeNum.java
// 因为2是最小的偶数素数，所以从3开始寻找sqrt(连续数列中最大的数）=limit,然后循环遍历3-limit,将其倍数对应的bool赋值为true
//

import static java.lang.Math.*;

public class PrimeNumFast {
    public static void main(String[] args) {
        int max = 100;
        // Get the max value from the command line,
        // if the argument has been provided:
        if (args.length != 0)
            max = Integer.parseInt(args[0]);
        boolean[] sieve = new boolean[max + 1];
        int limit = (int) floor(sqrt(max));
        System.out.print(1 + " ");
        if (max > 1)
            System.out.print(2 + " ");
        // Detect prime numbers
        for (int i = 3; i <= limit; i += 2)
            if (!sieve[i])
                for (int j = 2 * i; j <= max; j += i)
                    sieve[j] = true;
        // Print prime numbers
        for (int i = 3; i <= max; i += 2)
            if (!sieve[i])
                System.out.print(i + " ");
    }
}



