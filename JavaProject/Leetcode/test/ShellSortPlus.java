import java.util.Arrays;

public class ShellSortPlus {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 5, 2, 4, 6, 9, 8, 7 };
        ShellSort(arr);

    }

    public static void ShellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                if (j != i) {
                    arr[j] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
