class A {
	A(String s) {
		System.out.println("A constructor :" + s);
	}
}

class B {
	B(String s) {
		System.out.println("B constructor :" + s);
	}

}

class C extends A {
	B b;

	C(String s) {
		super(s);
		b = new B(s);
	}

}

public class E07 {
	public static void main(String[] args) {
		new C("Init String");

	}
}
