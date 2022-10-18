package HomeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	String psw = kb.nextLine();
	kb.close();

	String sign = "~!@#$%^";
	int len, k1, k2, k3;
	len = psw.length();
	k1 = k2 = k3 = 0;

	for (int i = 0; i < len; i++) {
	    char ch = psw.charAt(i);
	    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		k1 = 1;
	    } else if (ch >= '0' && ch <= '9') {
		k2 = 1;
	    } else if (sign.contains(Character.toString(ch))) {
		k3 = 1;
	    }
	}
	if ((k1 + k2 + k3) >= 2 && len >= 8) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }

}
