package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] people = new int[n];
        System.out.println(Find(n, k));
    }

    public static int Find(int n, int k) {
        int pos = 0;
        for (int i = 2; i < n + 1; ++i) {
            pos = (pos + k) % i;
        }
        return pos + 1;
    }
}
