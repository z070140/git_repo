import java.util.*;

public class Que_67_new {

    public static void main(String[] args) {
	List<Integer> res = new ArrayList<Integer>();
	int[] num = new int[10];
	int n = num.length;
	int k = 34;
	int count = 0;
	while (k != 0) {
	    k /= 10;
	    count++;
	}
	for (int i = n - 1; i >= 0; i--) {
	    int sum = num[i] + k % 10;
	    k /= 10;

	    if (sum >= 10) {
		k++;
		sum -= 10;
	    }
	    res.add(sum);
	}
	for (; k > 0; k /= 10) {
	    res.add(k % 10);
	    Collections.reverse(res);
	}
    }

}
