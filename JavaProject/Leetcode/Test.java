import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
	List<List<Integer>> rec = new ArrayList<List<Integer>>();
	List<Integer> in = new ArrayList<Integer>();
	in.add(1);
	in.add(1);
	rec.add(in);
	rec.get(0).set(0, 100);
	System.out.println(in);
	// in.clear();
	// in.set(0, 0);
	// System.out.println(rec);
	int[] a = { 0, 1 };
	int[] b = { 1, 1 };
	a = b;
	System.out.println(Arrays.toString(a));

    }
}
