
public class InsertionSort {

    public static void main(String[] args) {
	// 插入排序，从小到大
	int[] numbers = { 2, 5, 9, 8, 7, 3, 4, 1, 6 };
	for (int i = 1; i < numbers.length; i++) {
	    int temp = numbers[i];
	    int j = i;
	    while (j > 0 && temp < numbers[j - 1]) {
		numbers[j] = numbers[j - 1];
		j--;
	    }
	    if (j != i) {
		numbers[j] = temp;
	    }
	}
	for (int i = 0; i < numbers.length; i++) {
	    System.out.println(numbers[i]);
	}

    }

}
