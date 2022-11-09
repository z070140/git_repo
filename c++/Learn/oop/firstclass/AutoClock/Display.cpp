#include <iostream>
using namespace std;

class Display {
private:
    int value=0,limit=0;
public:
    Display(int limit) {
        this->limit = limit;
    }
    void increase() {
        value += 1;
        if (value == limit) {
            value = 0;
        }
    }

    int getValue() {
        return value;
    }

    Display(Display &display) {
       /* value = display.value;
        limit = display.limit;*/
        cout << "Display对象被复制了" << endl;
    }
};


