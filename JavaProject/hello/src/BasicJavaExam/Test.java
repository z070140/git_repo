package BasicJavaExam;


public class Test {

	public static void main(String[] args) {
		int num =100000;
		int count = 0;
		for (int i =2;i<=100000;i++) {
			int isPrime = 1;
			for (int j = 2;j<i;j++) {
				if(i%j==0) {
					isPrime =0;
					break;
				}
			}
			if (isPrime ==1) {
				count ++;
			}
		}
		System.out.println(count);
		
	}

}
