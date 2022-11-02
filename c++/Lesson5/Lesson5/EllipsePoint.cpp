#include <iostream>
#include <math.h>
#include <iomanip>
#define PI acos(-1)
using namespace std;

class Point
{
private:
    int x, y;
public:
    
    Point(int x = 0, int y = 0);

    ~Point();
    
    int GetX() { return x; }
    int GetY() { return y; }
};

Point::Point(int x, int y)
{
    this->x = x; this->y = y;
}



Point::~Point()
{
    
}


class Ellipse
{
private:
    Point a, b;
public:
    
    Ellipse(int xx1, int yy1, int xx2, int yy2);
    Ellipse(Point& p1, Point& p2);
    ~Ellipse();
    
    double Area();
    void Show();
};

Ellipse::Ellipse(int xx1, int yy1, int xx2, int yy2) :a(xx1, yy1), b(xx2, yy2) 
{  }


Ellipse::Ellipse(Point& p1, Point& p2) :a(p1), b(p2) {}


Ellipse::~Ellipse()
{
    
}

double Ellipse::Area()
{
    return abs((PI * ((a.GetX() - b.GetX()) / 2) * ((a.GetY() - b.GetY()) / 2)));;
}

void Ellipse::Show()
{
    cout << a.GetX() << " " << a.GetY() << " " << b.GetX() << " " << b.GetY() << endl;
}

int main()
{
    int x1, y1, x2, y2, x3, y3, x4, y4;
    cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
    Ellipse e1(x1, y1, x2, y2);
    Point p1(x3, y3);
    Point p2(x4, y4);
    Ellipse e2(p1, p2);
    e1.Show();
    e2.Show();
    printf("%.2f\n", e1.Area());
    printf("%.2f\n", e2.Area());
    return 0;
}

