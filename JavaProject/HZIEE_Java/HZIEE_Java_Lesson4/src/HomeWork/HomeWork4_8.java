package HomeWork;

import java.util.Scanner;

public class HomeWork4_8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        
        int[] mNumbers = new int[m];
        
        for (int i = 0; i < mNumbers.length; i++) {
            mNumbers[i] = in.nextInt();
        }
        int n = in.nextInt();
        int[] nNumbers = new int[n];
        for (int i = 0; i < nNumbers.length; i++) {
            nNumbers[i] = in.nextInt();
        }

        for (int i = 0; i < nNumbers.length; i++) {
            for (int j = 0; j < mNumbers.length; j++) {
                if (nNumbers[i] == mNumbers[j]) {
                    System.out.print(nNumbers[i] + " ");
                }
            }
        }

    }

}
