public class InsertionSortNew {

    public static void main(String[] args) {
        // 插入排序，从小到大
        int[] numbers = { 2, 5, 9, 8, 7, 3, 4, 1, 6 };
        //int[] numbers = { 2, 5, 9, 3};
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i-1; 
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            
            numbers[j + 1] = key;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
