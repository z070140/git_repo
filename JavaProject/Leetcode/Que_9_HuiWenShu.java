
public class Que_9_HuiWenShu {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	boolean isHuiWenShu = false;
//	int x = -121;
//	String s = Integer.toString(x);
//	String compareString = new StringBuffer(s).reverse().toString();
//	if (s.equalsIgnoreCase(compareString)) {
//	    isHuiWenShu = true;
//	}
//	System.out.println(isHuiWenShu);

	int x = 12321;
	int revertedNumber = 0;
	while (x > revertedNumber) {
	    revertedNumber = revertedNumber * 10 + x % 10;
	    x /= 10;
	}

    }
}
