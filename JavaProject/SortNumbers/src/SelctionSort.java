
public class SelctionSort {

    public static void main(String[] args) {
	// 选择排序，从小到大
	int[] numbers = { 1, 3, 5, 2, 4, 6, 9, 8, 7 };
//	int[] numbers = { 3, 2, 4, 1 };
	for (int i = 0; i < numbers.length - 1; i++) {
	    int min_id = i;
	    for (int j = i + 1; j < numbers.length; j++) {
		if (numbers[j] < numbers[min_id]) {
		    min_id = j;

		}

	    }

	    if (i != min_id) {
		int tmp = numbers[i];
		numbers[i] = numbers[min_id];
		numbers[min_id] = tmp;
	    }

	}
	for (int i = 0; i < numbers.length; i++) {
	    System.out.print(numbers[i] + " ");
	}
    }

}
