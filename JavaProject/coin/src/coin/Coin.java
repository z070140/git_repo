package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    public HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    public Coin() {
	coinnames.put(1, "penny");
	coinnames.put(10, "dime");
	coinnames.put(25, "quarter");
	coinnames.put(50, "half-dolar");
	coinnames.put(50, "五毛");

	System.out.println(coinnames.keySet().size());
	System.out.println(coinnames);
	for (Integer k : coinnames.keySet()) {
	    String s = coinnames.get(k);
	    System.out.println(s);
	}
    }

    public String getName(int amout) {
	if (coinnames.containsKey(amout))

	    return coinnames.get(amout);
	else {
	    return "NOT FOUND";
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	int amout = in.nextInt();
	Coin coin = new Coin();
	String name = coin.getName(amout);
	System.out.println(name);

    }

}
