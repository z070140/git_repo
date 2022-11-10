#include <iostream>
using namespace std;

class Clock {
public:
	Clock();
	Clock(int hour, int minute, int second);
	void set(int hour,int minute,int second);
	void print();
	private:
	int hour, minute, second;
};

Clock::Clock(int hour, int minute, int second) {
	this->hour = hour;
	this->minute = minute;
	this->second = second;
}
Clock::Clock() {
	hour = 0;
	minute = 0;
	second = 0;
}

void Clock::print() {
	cout << hour << ":" << minute << ":" << second << endl;
}
int main() {
	Clock c1(8,30,00);
	Clock c2;
	c1.print();
	c2.print();

	return 0;
}
