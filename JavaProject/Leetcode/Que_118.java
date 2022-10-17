import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que_118 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int numRows = 3;
	List<List<Integer>> rec = new ArrayList<List<Integer>>();
	List<Integer> in = new ArrayList<Integer>();
	for (int i = 0; i < numRows; i++) {
	    in.clear();
	    if (i == 0) {
		in.add(1);
		rec.add(in);
		in.clear();
		// return rec;
	    } else if (i == 1) {
		in.add(1);
		in.add(1);
		rec.add(in);
		in.clear();

	    } else {
		in.add(1);
		for (int j = 1; j < i; j++) {
		    in.add(rec.get(i - 1).get(j - 1) + rec.get(i - 1).get(j));
		}
		in.add(1);
		rec.add(in);
	    }
	}
	System.out.println(rec);
    }

}
