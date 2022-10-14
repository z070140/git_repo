import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
	// 交换法希尔排序
	int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
	shellSort(arr);
    }

    // 使用逐步推到的方式来编写希尔排序
    public static void shellSort(int[] arr) {
	int temp = 0;
	int x = 0;
	for (int gap = arr.length / 3; gap > 0; gap /= 3) {
	    for (int i = gap; i < arr.length; i++) {
		for (int j = i - gap; j >= 0; j -= gap) {
		    if (arr[j] > arr[j + gap]) {
			temp = arr[j];
			arr[j] = arr[j + gap];
			arr[j + gap] = temp;
		    }
		}
	    }
	    System.out.println("希尔排序第" + (++x) + "轮后=" + Arrays.toString(arr));
	}

    }

}
