#include <iostream>
using namespace std;


#include<iostream>
#include<cmath>
using namespace std;


class point {
private:int x;
	   int y;

public:
	point(int xx, int yy)
	{
		x = xx;
		y = yy;

	}

	int GetX();
	int GetY();
	point(point& p);

};

int point::GetX()
{
	return x;
}

int point::GetY()
{
	return y;
}

point::point(point& p)
{
	x = p.x;
	y = p.y;
	cout << "calling the copy constructor of point" << endl;


}

//类的组合

class Link
{
private:
	point p1, p2;
	double len;

public:
	Link(point xp1, point xp2);
	Link(Link& l);

	double Getl()
	{
		return len;
	}

};

Link::Link(point xp1, point xp2) :p1(xp1), p2(xp2)
{
	cout << "calling constructor of Line" << endl;
	double x = double(p1.GetX() - p2.GetX());
	double y = double(p1.GetY() - p2.GetY());
	len = sqrt(x * x + y * y);
}

Link::Link(Link& l) :p1(l.p1), p2(l.p2)
{
	cout << "calling the copy constructor of Line" << endl;
	len = l.len;
}

int main()
{
	point myp1(1, 1), myp2(4, 5);
	Link line(myp1, myp2);
	Link line2(line);
	cout << "The length of the line is：";
	cout << line.Getl() << endl;
	cout << "The length of the line2 is：";
	cout << line2.Getl() << endl;

	return 0;
}
