package HomeWork;

import java.util.Scanner;

public class HomeWork4_12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] Matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Matrix[i][j] = in.nextInt();
            }
        }
        int isUpper = 1;
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - 2; j > 0; j--) {
                if (Matrix[i][j] != 0) {
                    isUpper = 0;
                    break;
                }

            }
            n -= 1;
        }
        if (isUpper == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
