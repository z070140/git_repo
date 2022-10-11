package HomeWork;

import java.util.Scanner;

public class HomeWork4_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] nums = new int[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
                count += nums[i][j];
            }
        }
        if (m - 2 != 0 && n - 2 != 0) {
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    count -= nums[i][j];
                }
            }
        }

        System.out.print(count);
    }
}
