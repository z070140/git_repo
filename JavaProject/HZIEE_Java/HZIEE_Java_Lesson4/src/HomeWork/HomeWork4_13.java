package HomeWork;

import java.util.Scanner;

public class HomeWork4_13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] Matrix_1 = new int[n][m];
        int[][] Matrix_2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix_1[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix_2[i][j] = in.nextInt();
            }
        }
        int[][] Matrix_3 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix_3[i][j] = Matrix_1[i][j] + Matrix_2[i][j];
                System.out.print(Matrix_3[i][j] + " ");

            }
            System.out.print("\n");
        }

    }

}
