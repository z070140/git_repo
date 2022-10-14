package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_6 {

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
        // System.out.println(max);

        int min = FindMin(arr);
        // System.out.println(min);
        int i = 0;
        int j = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                break;
            }
        }
        // System.out.println(i);
        for (j = 0; j < numbers.length; j++) {
            if (numbers[j] == min) {
                break;
            }
        }
        // System.out.println(j);
        if (j != 0) {
            swap(numbers, j, 0);
        }
        if (i != numbers.length - 1) {
            swap(numbers, numbers.length - 1, i);
        }

        // System.out.println(Arrays.toString(numbers));

        // System.out.println(Arrays.toString(numbers));
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }

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

    public static int FindMin(int[] arr) {
        int min = arr[0];
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                temp = min;
                min = arr[i];
                arr[i] = temp;
            }
        }
        return min;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
