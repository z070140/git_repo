//: PrimeNum/PrimeNum.java
// find and print PrimeNum.

public class PrimeNum {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int isPrime = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1)
                System.out.println(i);
        }
    }

}

