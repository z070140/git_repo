package hello;

//import java.awt.FocusTraversalPolicy;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		OUT:
		for (;i<10;i++) {
			for (;i<5;i++) {
				System.out.print(i);
				if (i==3) {
				break OUT;
				}
			}
		}
		
	}

}
