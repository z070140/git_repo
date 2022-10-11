
public class BubbleSort {

    public static void main(String[] args) {
	// 冒泡排序，从小到大
	int[] numbers = { 1, 3, 5, 2, 4, 6, 9, 8, 7 };
	// int[] numbers = { 1, 3, 5, 2, 4 };
	for (int i = 0; i < numbers.length - 1; i++) {
	    int temp = 0;
	    boolean flag = true;
	    for (int j = 0; j < numbers.length - 1 - i; j++) {
		if (numbers[j] > numbers[j + 1]) {
		    temp = numbers[j];
		    numbers[j] = numbers[j + 1];
		    numbers[j + 1] = temp;
		    flag = false;
		}
	    }
	    if (flag) {
		break;
	    }
	}
	for (int i = 0; i < numbers.length; i++) {
	    System.out.print(numbers[i] + " ");

	}
    }

}
