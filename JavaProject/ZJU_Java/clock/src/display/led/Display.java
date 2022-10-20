package display.led;

public class Display {
	private int value = 0;
	private int limit = 0;
	private static int step = 1;

	public  Display(int limit) {
		this.limit = limit;
	}

	public void increase() {
		value++;
		if (value == limit) {
			value = 0;

		}
	}

	public int getValue() {
		return value;
	}

	

	public static void main(String[] args) {
		
	}
}
