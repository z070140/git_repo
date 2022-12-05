#include <iostream>
using namespace std;

class Point {
public:
	Point(int x , int y) { this->x = x; this->y = y; }
	int getX() const { return x; }
	int getY() const { return y; }
private:
	int x, y;
};

int main() {
	Point a(4, 5);
	Point* p1 = &a;
	cout << p1->getX () << endl;
	cout << a.getY() << endl;
}