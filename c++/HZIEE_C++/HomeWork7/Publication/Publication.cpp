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
		cout << "����:" << title << endl;
		cout << "�۸�:" << price << "Ԫ\n";
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
		cout << "ҳ��:" << page << endl;
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
		cout << "����ʱ��:" << playTime <<"����\n";
	}
};

int main()
{
	Publication p;				// �������
	p.GetData();				// ���������Ϣ
	cout << "��������Ϣ:" << endl;		// ������ʾ
	p.Show();				// ��������Ϣ
	Book b;				// �������	
	b.GetData();				// ���������Ϣ
	cout << "�鼮��Ϣ:" << endl;		// ������ʾ
	b.Show();				// ��������Ϣ
	Tape t;					// �������
	t.GetData();				// ���������Ϣ
	cout << "�Ŵ���Ϣ:" << endl;		// ������ʾ
	t.Show();				// ��������Ϣ	
	return 0;               	// ����ֵ, ���ز���ϵͳ
}