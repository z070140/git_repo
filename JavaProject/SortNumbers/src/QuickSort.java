import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = { -9, 78, 0, 23, -567, 70 };
	quickSort(arr, 0, arr.length - 1);
	System.out.print(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int left, int right) {
	int l = left; // 左下标
	int r = right; // 右下标
	int pivot = arr[(left + right) / 2]; // 中轴值
	int temp = 0; // 临时变量

	while (l < r) { // 让比pivot小的值放到左边;
	    while (arr[l] < pivot) { // 在pivot左边一直寻找，直到找到大于等于pivot的值，才推出
		l += 1;

	    }
	    while (arr[r] > pivot) {
		r -= 1;

	    }
	    if (l >= r) {
		break;
	    }
	    temp = arr[l];
	    arr[l] = arr[r];
	    arr[r] = temp;

	    // 如果交换完后，发现arr[l] == pivot ，前移
	    if (arr[l] == pivot) {
		r -= 1;
	    }
	    if (arr[r] == pivot) {
		l += 1;
	    }
	}
	if (l == r) {
	    l += 1;
	    r -= 1;
	}
	// 向左递归
	if (left < r) {
	    quickSort(arr, left, r);
	}
	if (right > l) {
	    quickSort(arr, l, right);
	}
    }

}
