package HomeWork;

public class FindNiceNumber {

	static int[] CountFactor(int i, int[] factor) {
		// CountFactor = new ();
		int j = 1;
		int id = 0;
		for (j = 1; j < i; j++) {
			if (i % j == 0) {
				factor[id] = j;
				id++;
			}
		}

		return factor;
	}

	static int CountFactor_id(int i, int[] factor) {
		// CountFactor = new ();
		int j = 1;
		int id = 0;
		for (j = 1; j < i; j++) {
			if (i % j == 0) {
				factor[id] = j;
				id++;
			}
		}

		return id;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;

		for (int i = 1; i <= n; i++) {
			int[] factor = new int[1000];
			int sum = 0;
			int id = 0;
			CountFactor(i, factor);
			id = CountFactor_id(i, factor);
			for (int k = 0; k < id; k++) {
				sum += factor[k];

			}
			// System.out.println(sum);
			if (i == sum) {
				System.out.print(i + " ");
			}
		}

	}

}
