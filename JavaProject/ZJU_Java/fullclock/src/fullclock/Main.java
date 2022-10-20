package fullclock;

public class Main {

    public static void main(String[] args) {
	java.util.Scanner in = new java.util.Scanner(System.in);

	Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
	while (true) {
	    clock.tick();

	    System.out.println(clock);
	}
	// in.close();

    }

}

class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int limit) {
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

}

class Clock {
    private int myhour;
    private int myminute;
    private int mysecond;
    private Display hour;
    private Display minute;
    private Display second;

    public Clock(int hour, int minute, int second) {
	this.myhour = hour;
	this.myminute = minute;
	this.mysecond = second;

	this.hour = new Display(this.myhour);
	this.minute = new Display(this.myminute);
	this.second = new Display(this.mysecond);

    }

    // private Display hour = new Display(24);
    // private Display minute = new Display(60);
    // private Display second = new Display(60);

    public void tick() {

	second.increase();
	if (second.getValue() == 0) {
	    minute.increase();
	    if (minute.getValue() == 0) {
		hour.increase();
	    }
	}

    }

    public String toString() {
	return String.format("%02d:%02d:%02d\n", hour.getValue(),
		minute.getValue(), second.getValue());
    }

}