package HomeWork;

import java.util.Scanner;

class Money {
    private int yuan, jiao, fen;

    Money(double mount) {
	
    }

    private void show() {
	System.out.println(yuan + " yuan " + jiao + " jiao " + fen + " fen");
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double mount = input.nextDouble();
	input.close();

	Money m = new Money(mount);
	m.show();
    }

}
