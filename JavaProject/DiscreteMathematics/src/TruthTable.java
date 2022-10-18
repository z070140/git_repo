import java.util.Scanner;

public class TruthTable {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	String compareString = "^[A-Z]+$";
	String sString = "";
	char c = 'A';
	int result, p, q, r, s;
	System.out.println("构造命题公式真值表");
	System.out.println("命题公式A:﹁(pvq)^((pvr)vs)");
	while (true) {
	    System.out.print("请输入命题公式(默认为A):");
	    sString = in.nextLine();
	    char[] chars = sString.toCharArray();
	    c = chars[0];
	    if (sString.matches(compareString)) {
		if (c != 'A') {
		    System.out.println("抱歉，目前仅支持命题公式A的真值表构造");
		} else {
		    break;
		}

	    } else {
		System.out.println("输入有误，请输入正确的命题公式编号");
	    }
	}
	switch (c) {
	case 'A': {
	    while (true) {
		System.out.println(
			"请选择想要的格式(1.输入p,q,r,s的值输出命题公式A的结果。2.直接输出完整真值表。):");
		int n = in.nextInt();
		if (n == 1) {
		    while (true) {
			System.out.print("请输入p的值：");
			p = in.nextInt();
			if (p != 0 && p != 1) {
			    System.out.println("输入有误，请输入合法的p的值");
			} else {
			    break;
			}
		    }
		    boolean pboolean = p == 0 ? false : true;
		    while (true) {
			System.out.print("请输入q的值：");
			q = in.nextInt();
			if (q != 0 && q != 1) {
			    System.out.println("输入有误，请输入合法的q的值");
			} else {
			    break;
			}
		    }
		    boolean qboolean = q == 0 ? false : true;
		    while (true) {
			System.out.print("请输入r的值：");
			r = in.nextInt();
			if (r != 0 && r != 1) {
			    System.out.println("输入有误，请输入合法的r的值");
			} else {
			    break;
			}
		    }
		    boolean rboolean = r == 0 ? false : true;
		    while (true) {
			System.out.print("请输入s的值：");
			s = in.nextInt();
			if (s != 0 && s != 1) {
			    System.out.println("输入有误，请输入合法的s的值");
			} else {
			    break;
			}
		    }
		    boolean sboolean = s == 0 ? false : true;
//		    System.out.println(pboolean);
//		    System.out.println(qboolean);
//		    System.out.println(rboolean);
//		    System.out.println(sboolean);
		    System.out.print("命题公式A的真值情况为");
		    System.out.println((!(pboolean | qboolean)
			    & ((pboolean | rboolean) | sboolean)));

		    break;
		} else if (n == 2) {
		    truthTable();
		    break;
		} else {
		    System.out.println("输入信息有误,请重新输入");
		}
	    }
	    break;
	}
	}
    }

    public static void truthTable() {
	int p, q, r, s;
	System.out.print("p  ");
	System.out.print("q  ");
	System.out.print("r  ");
	System.out.print("s  ");
	System.out.print("(pvr)  ");
	System.out.print("(pvr)vs  ");
	System.out.print("(pvq)  ");
	System.out.print("﹁(pvq)  ");
	System.out.println("﹁(pvq)^((pvr)vs)");
	for (p = 0; p <= 1; p++) {
	    for (q = 0; q <= 1; q++) {
		for (r = 0; r <= 1; r++) {
		    for (s = 0; s <= 1; s++) {
			System.out.print(p + "  " + q + "  " + r + "  " + s
				+ "    " + (p | r) + "      " + ((p | r) | s)
				+ "        " + (p | q) + "       ");
			int test = p | q;
			boolean fouding = (test == 0) ? true : false;
			int temp = fouding ? 1 : 0;
			System.out.print(temp + "           "
				+ (temp & (((p | r) | s))) + "\n");
		    }
		}
	    }

	}

    }
}
