#include <iostream>
#include "Display.cpp"
using namespace std;
class Clock {
private:
    Display hour;
    Display minute;

public:
    Clock();
    //Clock(Display Chour, Display Cminute);
    void start() {
        while (true) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }
};

Clock::Clock():hour(24),minute(60) {
    cout << "Clock对象被构造了" << endl;
}

//Clock::Clock(Display Chour, Display Cminute) :hour(Chour), minute(Cminute) {
//    cout << "Clock对象被构造了" << endl;
//}

int main() {
    Display hour(24);
    Display minute(60);
    //Clock clock(hour,minute);
    Clock clock;
    clock.start();
}
