package HomeWork;

import java.util.Scanner;
import java.util.*;

public class HomeWork4_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] Carriage = new int[N];
        int count = 0;
        int[] NewCarriage = new int[N];
        for (int i = 0; i < N; i++) {
            Carriage[i] = in.nextInt();
        }
        for (int j = 0; j < N - 1; j++) {
            boolean flag = false;
            for (int i = 0; i < N - 1 - j; i++) {
                if (Carriage[i] > Carriage[i + 1]) {
                    int temp = Carriage[i];
                    Carriage[i] = Carriage[i + 1];
                    Carriage[i + 1] = temp;
                    count++;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        System.out.println(count);
    }
}