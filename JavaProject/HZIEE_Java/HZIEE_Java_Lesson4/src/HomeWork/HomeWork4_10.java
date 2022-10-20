package HomeWork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork4_10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        int[] arr = Arrays.copyOf(num, num.length);
        int[] arr2 = Arrays.copyOf(num, num.length);
        int max = FindMax(arr2);
        // System.out.print(max);
        int[][] count = countnum(arr, max);
        // System.out.println(Arrays.toString(count));
        Arrays.sort(num);
        num = Deduplication(num);
        for (int i : num) {
            System.out.println(i + " " + count[i][0]);
        }

    }

    public static int[][] countnum(int[] arr, int max) {
        int[][] count = new int[max + 1][1];
        for (int i : arr) {
            count[i][0] += 1;
        }

        return count;
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

    public static int[] Deduplication(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; ++i) {
            set.add(arr[i]);
        }
        int[] needArr = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            needArr[i] = integer;
            ++i;
        }
        return needArr;

//        arr = Arrays.stream(arr).sorted().distinct().toArray();
//        return arr;
    }
}
