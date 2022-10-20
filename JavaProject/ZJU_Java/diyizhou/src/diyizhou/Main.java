package diyizhou;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(), in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5, 6)).print();

		a.print();

		b.print();

		in.close();

	}

}

class Fraction {
	private int a;
	private int b;

	Fraction(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void print() {
		int oa = this.a;
		int ob = this.b;
		int r;
		while (ob != 0) {
			r = oa % ob;
			oa = ob;
			ob = r;
		}
		this.a = this.a / oa;
		this.b = this.b / oa;
		if (this.a == this.b) {
			System.out.println(1);
		} else {
			System.out.println(this.a + "/" + this.b);
		}

	}

	double toDouble() {

		return (double) this.a / this.b;
	}

	Fraction plus(Fraction r) {
		int a = r.a, b = r.b;

		a *= this.b;
		this.a *= b;
		this.b *= b;
		b = this.b;
		a += this.a;
		return new Fraction(a, b);
	}

	Fraction multiply(Fraction r) {
		int a = r.a, b = r.b;
		a *= this.a;
		b *= this.b;
		return new Fraction(a, b);
	}

}