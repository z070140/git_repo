#include<iostream>
using namespace std;
#include <string>

class Publication {
private:
	string title;
	float price;
public:
	void GetData() {
		cin >> title >> price;
	}
	void Show() {
		cout << "标题:" << title << endl;
		cout << "价格:" << price << "元\n";
	}
};

class Book :Publication {
private:
	int page;
public:
	void GetData() {
		Publication::GetData();
		cin >> page;
	}
	void Show() {
		Publication::Show();
		cout << "页数:" << page << endl;
	}
};

class Tape :Publication {
private:
	float playTime;
public:
	void GetData() {
		Publication::GetData();
		cin >> playTime;
	}
	void Show() {
		Publication::Show();
		cout << "播放时间:" << playTime <<"分钟\n";
	}
};

int main()
{
	Publication p;				// 定义对象
	p.GetData();				// 输入相关信息
	cout << "出版物信息:" << endl;		// 输入提示
	p.Show();				// 输出相关信息
	Book b;				// 定义对象	
	b.GetData();				// 输入相关信息
	cout << "书籍信息:" << endl;		// 输入提示
	b.Show();				// 输出相关信息
	Tape t;					// 定义对象
	t.GetData();				// 输入相关信息
	cout << "磁带信息:" << endl;		// 输入提示
	t.Show();				// 输出相关信息	
	return 0;               	// 返回值, 返回操作系统
}