package hello;

public class CharUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 'z' - 'a';
		System.out.println(i);
		char c = 'A';
		char d = (char)(c + ('a'-'A'));
		System.out.println(d);
	}

}
