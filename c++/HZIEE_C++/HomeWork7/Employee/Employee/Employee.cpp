#include<iostream>
using namespace std;
#include<string>

class Employee {
private:
	int num;
	string name;
	double basicSalary;
	double prize;

public:

	Employee(int num, string name, double basicSalary, double prize) {
		this->num = num;
		this->name = name;
		this->basicSalary = basicSalary;
		this->prize = prize;
	}
	void Show();
	void ShowSalary();
	double getBasicSalary() {
		return basicSalary;
	}
	double getPrize() {
		return prize;
	}
};

void Employee::Show() {
	cout << "���:" << num << "\n����:" << name << "\n��������:" << basicSalary << "Ԫ\n����:" << prize << "Ԫ" << endl;
}
void Employee::ShowSalary() {
	cout << "ʵ������:" << basicSalary + prize << "Ԫ" << endl;
}

class Saleman : virtual public Employee {
private:
	double deductRate;
	double personAmount;
public:
	Saleman(int num, string name, double basicSalary, double prize, double deductRate, double personAmount) :Employee( num, name,basicSalary ,prize)
	{
		this->deductRate = deductRate;
		this->personAmount = personAmount;
	}
	void Show();
	void ShowSalary();
	double getDeductRate() {
		return deductRate;
	}
	double getPersonAmount() {
		return personAmount;
	}
};

void Saleman::Show() {
	Employee::Show();
	cout << "����Ա��ɱ���:" << deductRate << endl;
	cout << "�������۶�:" << personAmount << "Ԫ" << endl;
}
void Saleman::ShowSalary() {
	cout << "ʵ������:" << Employee::getBasicSalary() + Employee::getPrize() + deductRate * personAmount << "Ԫ" << endl;
}

class Manager :virtual public Employee {
private:
	double totalDeductRate;
	double totalAmount;
public:
	Manager(int num, string name, double basicSalary, double prize, double totalDeductRate, double totalAmount) :Employee(num, name, basicSalary, prize)
	{
		this->totalAmount = totalAmount;
		this->totalDeductRate = totalDeductRate;
	}
	void Show();
	void ShowSalary();
	double getTotalDeductRate() {
		return totalDeductRate;
	}
	double getTotalAmount() {
		return totalAmount;
	}
};
void Manager::Show() {
	Employee::Show();
	cout << "������ɱ���:" << totalDeductRate << endl;
	cout << "�����۶�:" << totalAmount << "Ԫ" << endl;
}
void Manager::ShowSalary() {
	cout << "ʵ������:" << Employee::getBasicSalary() + Employee::getPrize() + totalAmount * totalDeductRate << "Ԫ" << endl;
}

class SaleManager :public Saleman, Manager {
public:
	SaleManager(int num, string name, double basicSalary, double prize, double deductRate, double personAmount, double totalDeductRate, double totalAmount) :Employee(num, name, basicSalary, prize) ,Saleman( num ,name, basicSalary,  prize,  deductRate,  personAmount) , Manager(num, name,  basicSalary,  prize,  totalDeductRate,  totalAmount) {

	}
	void Show();
	void ShowSalary();
};
void SaleManager::Show() {
	Employee::Show();
	cout << "����Ա��ɱ���:" << Saleman::getDeductRate() << endl;
	cout << "�������۶�:" << Saleman::getPrize() << "Ԫ" << endl;
	cout << "������ɱ���:" << Manager::getTotalDeductRate() << endl;
	cout << "�����۶�:" << Manager::getTotalAmount() << "Ԫ" << endl;
}
void SaleManager::ShowSalary() {
	cout << "ʵ������:" << Employee::getBasicSalary() + Employee::getPrize() + Saleman::getDeductRate() * Saleman::getPrize() + Manager::getTotalDeductRate() * Manager::getTotalAmount() << "Ԫ" << endl;
}

int main()
{
	Employee e(106, "����", 1680, 1080);	// �������
	cout << "Ա����Ϣ:" << endl;	// �����ʾ
	e.Show();			// ���������Ϣ
	e.ShowSalary();		// ���ʵ������
	Saleman s(108, "�����", 2680, 1680, 0.15, 23000);	// �������
	cout << endl << "����Ա��Ϣ:" << endl;		// �����ʾ
	s.Show();			// ���������Ϣ
	s.ShowSalary();		// ���ʵ������
	Manager m(116, "��ٻ", 3680, 2680, 0.1, 83000);	// �������
	cout << endl << "������Ϣ:" << endl;			// �����ʾ
	m.Show();			// ���������Ϣ
	m.ShowSalary();		// ���ʵ������
	SaleManager sm(118, "���", 3680, 2680, 0.15, 28000, 0.1, 88000);
	cout << endl << "���۾�����Ϣ:" << endl;		// �����ʾ
	sm.Show();			// ���������Ϣ
	sm.ShowSalary();		// ���ʵ������
	return 0;               	// ����ֵ, ���ز���ϵͳ
}