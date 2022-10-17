import java.util.Scanner;

public class TruthTable_A {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	String compareString = "^[A-Z]+$";
	char c = 'A';
	System.out.print("请输入命题公式（默认为A）:");
	String s = in.nextLine();
	char[] chars = s.toCharArray();
	c = chars[0];
	if (s.matches(compareString)) {
	    if (c != 'A') {
		System.out.println("抱歉，目前仅支持命题公式A的真值表构造");
	    }

	} else {
	    System.out.println("输入有误，请输入正确的命题公式编号");
	}

	truthTable(c);

    }

    public static void truthTable(char c) {
	switch (c) {
	case 'A': {
	    System.out.println(c);

	    break;
	}

	}
    }
}
