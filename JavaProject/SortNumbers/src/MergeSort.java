import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = { 8, 4, 5, 7, 1, 3, 6, 2 };
	int[] temp = new int[arr.length];
	mergeSort(arr, 0, arr.length - 1, temp);
	System.out.println("归并排序后="+Arrays.toString(arr));
    }

    // 分+合
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
	if (left < right) {
	    int mid = (left + right) / 2;
	    // 向左递归
	    mergeSort(arr, left, mid, temp);
	    // 向右递归分解
	    mergeSort(arr, mid + 1, right, temp);
	    //到合并时
	    merge(arr, left, mid, right, temp);
	}
    }

    // 合并的方法
    /**
     * 
     * @param arr   排序的原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  做中转的数组
     */

    public static void merge(int[] arr, int left, int mid, int right,
	    int[] temp) {
	int i = left;
	int j = mid + 1;
	int t = 0;

	// 先把左右两边的数据按规则填充到temp
	// 直到左右两边有一边全部处理完毕
	while (i <= mid && j <= right) {
	    // 如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
	    // 即将左边的当前元素，拷贝到temp数组
	    // 然后t++，i++
	    if (arr[i] <= arr[j]) {
		temp[t] = arr[i];
		t += 1;
		i += 1;
	    } else { // 反之，将右边有序序列的当前元素拷贝到temp数组
		temp[t] = arr[j];
		t += 1;
		j += 1;

	    }
	}

	// 把有剩余数据的一边的数据一次全部填充到temp去
	while (i <= mid) { // 左边的有序序列还有剩余的元素，就全部填充到temp
	    temp[t] = arr[i];
	    t += 1;
	    i += 1;
	}

	while (j <= right) { // 右边的有序序列还有剩余的元素，就全部填充到temp
	    temp[t] = arr[j];
	    t += 1;
	    j += 1;
	}
	// 将temo数组的元素拷贝到arr

	t = 0;
	int tempLeft = left;
	while (tempLeft <= right) {
	    arr[tempLeft] = temp[t];
	    t += 1;
	    tempLeft += 1;
	}
    }

}
