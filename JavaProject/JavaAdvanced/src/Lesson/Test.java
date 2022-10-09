package Lesson;

public class Test {

	void num(String n) {
		System.out.println(n);
	}
	
	void num(double n) {
		System.out.println(n+100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test number = new Test();
		number.num(0);
	}

}
