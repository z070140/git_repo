package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        int[] arr = Arrays.copyOf(numbers, numbers.length);
        int max = FindMax(arr);
        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                break;
            }
        }
        System.out.println(max + " " + i);
    }

    public static int FindMax(int[] arr) {
        int max = arr[0];
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        return max;
    }

}
