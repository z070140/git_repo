package HomeWork;

import java.util.Scanner;

public class HomeWork4_4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int count = 0;
        if (n == 0) {
            System.out.print(0);
        }
        while (m != 0) {
            m /= 2;
            count++;
        }

        int[] num = new int[count];

        for (int i = 0; i < num.length; i++) {
            if (n % 2 != 0) {
                num[i] = 1;
            } else {
                num[i] = 0;
            }
            n /= 2;
        }
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
        }
    }

}
