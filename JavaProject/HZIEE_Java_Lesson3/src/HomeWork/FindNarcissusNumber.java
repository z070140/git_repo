package HomeWork;

public class FindNarcissusNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int n = 999;

		// int j = 0;
		for (int i = 153; i <= 999; i++) {
			int sum = 0;
			int j = i;
			int k = i;
			while (k != 0) {
				sum = sum + (int) Math.pow(k % 10, 3);
				k = k / 10;
			}
			if (j == sum) {
				System.out.print(j + " ");
			}
		}
	}

}
