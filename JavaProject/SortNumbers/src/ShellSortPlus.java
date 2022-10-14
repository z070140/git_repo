import java.util.Arrays;

public class ShellSortPlus {

    public static void main(String[] args) {
	// 移动法希尔排序
	int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
	shellSort(arr);
    }

    public static void shellSort(int[] arr) {
	for (int gap = arr.length / 3; gap > 0; gap /= 3) {
	    for (int i = gap; i < arr.length; i++) {
		int j = i;
		int temp = arr[j];
		if (arr[j] < arr[j - gap]) {
		    while (j - gap >= 0 && temp < arr[j - gap]) {
			arr[j] = arr[j - gap];
			j -= gap;
		    }
		    arr[j] = temp;
		}
	    }
	}
	System.out.println(Arrays.toString(arr));
    }
}
