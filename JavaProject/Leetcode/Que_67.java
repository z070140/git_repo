import java.util.*;

public class Que_67 {

    public static void main(String[] args) {
	List<Integer> res = new ArrayList<Integer>();
	int[] num = new int[10];
	int n = num.length;
	int k = 32;
	for (int i = n - 1; i >= 0 || k != 0; i--, k /= 10) {
	    k += num[i];
	    //k %= 10;
	    res.add(k%10);
	}
    }

}
