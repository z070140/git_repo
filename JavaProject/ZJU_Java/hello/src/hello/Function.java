package hello;

public class Function {
	public static int max(int a, int b) {
		int ret = 0 ;
		if (a > b) {
			ret = a;
		}
		if (a < b) {
			ret = b;
		}
		return ret;
	}
//	public static boolean isPrime(int i) {
//		boolean isPrime = true;
//		
//		
//		
//		return isPrime;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 5;
		int c;
		c = max(a, b);
		System.out.println(max(a, b));
		System.out.println((char)10);
	}

}
