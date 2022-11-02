#include<iostream>
using namespace std;
#include<math.h>
#define PI acos(-1)
class Ellipse {
public:
	Ellipse(int x1, int y1, int x2, int y2) {
		this->x1 = x1;
		this->y1 = y1;
		this->x2 = x2;
		this->y2 = y2;
	}
	Ellipse(const Ellipse& e) {
		x1 = e.x1;
		y1 = e.y1;
		x2 = e.x2;
		y2 = e.y2;
	}
	~Ellipse() {
		cout << "xigou " << " " << x1 <<" " << y1<<endl;
	}
	int getx1() {
		return x1;
	}
	int gety1() {
		return y1;
	}
	int getx2() {
		return x2;
	}
	int gety2() {
		return y2;
	}
	double Area() {
		return abs((PI * ((x1 - x2) / 2) * ((y1 - y2) / 2)));
	}
	

	void Show() {
		cout << x1<<" "<< y1<<" " << x2 << " " << y2 << endl;
	}
	void Fun(int y) {
		y1 += y;
		y2 -= y;
	}
private:
	int x1, y1, x2, y2;
};


int main() {
	int x1, y1, x2, y2;
	cin >> x1 >> y1 >> x2 >> y2;
	int y;
	cin >> y;
	Ellipse ellipse(x1, y1, x2, y2);
	ellipse.Show();

	Ellipse newellipse(ellipse);
	newellipse.Show();
	printf("%.2f\n", ellipse.Area());
	printf("%.2f\n", newellipse.Area());
	newellipse.Fun(y);
	printf("%.2f\n", newellipse.Area());
	return 0;
}