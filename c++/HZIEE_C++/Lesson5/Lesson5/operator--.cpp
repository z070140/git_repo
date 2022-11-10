#include<iostream>
using namespace std;


class Number {
	friend ostream& operator<<(ostream& out, Number& number);
public:
	Number(int number) {
		this->number = number;
	}

	Number& operator--() {

		number -= 1;
		return *this;
	}
	Number operator--(int) {
		Number temp = *this;
		number -= 1;
		return temp;
	}
private:
	int number;
};


ostream& operator<<(ostream& out,Number num) {
	out << num.number;
	return out;
}

void test() {

	Number num(10);
	cout << num << endl;
	cout << --num << endl;
	cout << num-- << endl;
	cout << num << endl;
}

int main() {
	test();


	return 0;
}