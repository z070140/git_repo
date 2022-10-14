
public class InsertionSortPlus {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] numbers = { 2, 5, 9, 8, 7, 3, 4, 1, 6 };
	for (int i = 1; i < numbers.length; i++) {
	    int temp = numbers[i];
	    int low = 0;
	    int high = i - 1;
	    while (low <= high) {
		int mid = (low + high) / 2;
		if (numbers[mid] > temp) {
		    high = mid - 1;

		} else {
		    low = mid + 1;
		}
	    }
	    for (int j = i; j > low; j--) {
		numbers[j] = numbers[j - 1];
	    }
	    numbers[low] = temp;
	}
	for (int i = 0; i < numbers.length; i++) {
	    System.out.println(numbers[i]);
	}
    }

}
