import java.util.Arrays;

public class Que_14_LongestCommonPrefix_New {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String[] strs = { "aac", "cab", "abb" };
	int min = FindMin(strs);

	int[] sameChar = FindSameChar(strs, min);

	int minSame = CountminSame(sameChar);

	String s = new String();
	for (int i = 0; i < minSame; i++) {
	    s += strs[0].charAt(i);
	}

	System.out.println(s);
    }

    public static int FindMin(String[] strs) {
	int min = 200;
	// String[] temp = Arrays.copyOf(strs, 0);
	for (int i = 0; i < strs.length; i++) {
	    if (min > strs[i].length()) {
		min = strs[i].length();
	    }
	}

	return min;
    }

    public static int[] FindSameChar(String[] strs, int min) {

	int[] temp = new int[strs.length];
	int i = 0;
	for (i = 0; i < strs.length - 1; i++) {
	    int count = 0;
	    for (int j = 0; j < min; j++) {
		if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
		    count += 1;
		} else {
		    break;
		}
	    }
	    temp[i] = count;

	}
	int count = 0;
	for (int j = 0; j < min; j++) {
	    if (strs[0].charAt(j) == strs[strs.length - 1].charAt(j)) {
		count += 1;
	    }
	}
	temp[i] = count;
	return temp;

    }

    public static int CountminSame(int[] arr) {
	int minSame = 200;

	int count = 0;
	for (int k = 0; k < arr.length; k++) {
	    count += arr[k];
	}
	if (count == 0) {
	    return 0;
	}
	for (int i = 0; i < arr.length; i++) {
	    if (minSame > arr[i]) {
		minSame = arr[i];
	    }
	}

	return minSame;
    }

}
