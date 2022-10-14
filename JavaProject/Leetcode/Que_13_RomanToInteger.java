
public class Que_13_RomanToInteger {

    public static void main(String[] args) {
	// 罗马数字转换为整数，比较这一位和后一位的数字，若这一位小于后一位，则减去这一位
	// TODO Auto-generated method stub
	String s = "MCMXCIV";
	int sum = 0;
	int preNum = getValue(s.charAt(0));
	for (int i = 1; i < s.length(); i++) {
	    int num = getValue(s.charAt(i));
	    if (preNum < num) {
		sum -= preNum;
	    } else {
		sum += preNum;
	    }
	    preNum = num;
	}
	sum += preNum;
	System.out.print(sum);
    }

    public static int getValue(char ch) {
	switch (ch) {
	case 'I':
	    return 1;
	case 'V':
	    return 5;
	case 'X':
	    return 10;
	case 'L':
	    return 50;
	case 'C':
	    return 100;
	case 'D':
	    return 500;
	case 'M':
	    return 1000;
	default:
	    return 0;

	}
    }

}
