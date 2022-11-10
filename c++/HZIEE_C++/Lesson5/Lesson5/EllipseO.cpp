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



private:

	int x1, y1, x2, y2;

};



int main() {

	int x1, y1, x2, y2;

	cin >> x1 >> y1 >> x2 >> y2;

	Ellipse ellipse(x1, y1, x2, y2);

	printf("%.2f", ellipse.Area());

	return 0;

}

​