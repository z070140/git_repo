public class SelctionSort {

    public static void main(String[] args) {
        // 选择排序，从小到大
        int[] numbers = { 1, 3, 5, 2, 4, 6, 9, 8, 7 };

        for (int i = 0; i < numbers.length - 1; i++) {
            int min_id = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[min_id] > numbers[j]) {
                    min_id = j;
                }
            }
            if (min_id != i) {
                int temp = numbers[i];
                numbers[i] = numbers[min_id];
                numbers[min_id] = temp;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}