#include<iostream>
using namespace std;
#include<string>

class Cube {
public:
	Cube(int m_L, int m_W, int m_H) {
		this->m_H = m_H;
		this->m_L= m_L;
		this->m_W= m_W;
	};
	~Cube() {
		cout << "析构函数已经被调用" << endl;
	};
	int getL() {
		return m_L;
	};
	int getW() {
		return m_W;
	};
	int getH() {
		return m_H;
	};

	int caculatS() {
		return 2 * m_L + 2 * m_H + 2 * m_W;
	};

	int caculatV() {
		return m_L * m_H * m_W;
	};

private:
	int m_L,m_W,m_H;
};


int main() {
	Cube c1(10,10,10);
	
	cout << c1.caculatV() << endl;
	return 0;
}
