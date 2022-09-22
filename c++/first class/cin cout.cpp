#include <iostream>
using namespace std;
int main()
{
	cout << "请输入你的姓名与年龄：" << endl;
	char name[30];
	int age;
	cin >> name >> age;
	cout << "你的姓名是：" << name << endl;
	cout << "你的年龄是:" << age <<endl;
	return 0;
}