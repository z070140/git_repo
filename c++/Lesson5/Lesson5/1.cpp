#include<iostream>
using namespace std;

const double PI = 3.14;

class Circle
{
public:
	Circle();
	~Circle();
	int m_r;
	double calculateZC() {
		return 2 * PI * m_r;
	}
private:

};

Circle::Circle()
{
}

Circle::~Circle()
{
}

int main() {
	Circle circle;
	circle.m_r = 10;
	cout<<"圆的周长为：" << circle.calculateZC() << endl;
	return 0;
}