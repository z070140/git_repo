package hello;

public class MulitpleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int n = 2;
			int count = 1;
			int i =2;
			//int isPrime = 
			while (count<=50) {
				int n =2;
				int isPrime = 1;
				while(n<i) {
					if(i%n==0) {
						isPrime=0;
						//break;
					}
					n++;
				}
				
				if (isPrime==1) {
					count++;
					System.out.print(i+" ");
				}
				i++;
			}
	}

}
