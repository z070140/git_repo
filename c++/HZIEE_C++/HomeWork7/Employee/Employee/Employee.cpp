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
	cout << "编号:" << num << "\n姓名:" << name << "\n基本工资:" << basicSalary << "元\n奖金:" << prize << "元" << endl;
}
void Employee::ShowSalary() {
	cout << "实发工资:" << basicSalary + prize << "元" << endl;
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
	cout << "销售员提成比例:" << deductRate << endl;
	cout << "个人销售额:" << personAmount << "元" << endl;
}
void Saleman::ShowSalary() {
	cout << "实发工资:" << Employee::getBasicSalary() + Employee::getPrize() + deductRate * personAmount << "元" << endl;
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
	cout << "经理提成比例:" << totalDeductRate << endl;
	cout << "总销售额:" << totalAmount << "元" << endl;
}
void Manager::ShowSalary() {
	cout << "实发工资:" << Employee::getBasicSalary() + Employee::getPrize() + totalAmount * totalDeductRate << "元" << endl;
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
	cout << "销售员提成比例:" << Saleman::getDeductRate() << endl;
	cout << "个人销售额:" << Saleman::getPrize() << "元" << endl;
	cout << "经理提成比例:" << Manager::getTotalDeductRate() << endl;
	cout << "总销售额:" << Manager::getTotalAmount() << "元" << endl;
}
void SaleManager::ShowSalary() {
	cout << "实发工资:" << Employee::getBasicSalary() + Employee::getPrize() + Saleman::getDeductRate() * Saleman::getPrize() + Manager::getTotalDeductRate() * Manager::getTotalAmount() << "元" << endl;
}

int main()
{
	Employee e(106, "李明", 1680, 1080);	// 定义对象
	cout << "员工信息:" << endl;	// 输出提示
	e.Show();			// 输出基本信息
	e.ShowSalary();		// 输出实发工资
	Saleman s(108, "李杰明", 2680, 1680, 0.15, 23000);	// 定义对象
	cout << endl << "销售员信息:" << endl;		// 输出提示
	s.Show();			// 输出基本信息
	s.ShowSalary();		// 输出实发工资
	Manager m(116, "吴倩", 3680, 2680, 0.1, 83000);	// 定义对象
	cout << endl << "经理信息:" << endl;			// 输出提示
	m.Show();			// 输出基本信息
	m.ShowSalary();		// 输出实发工资
	SaleManager sm(118, "吴杰", 3680, 2680, 0.15, 28000, 0.1, 88000);
	cout << endl << "销售经理信息:" << endl;		// 输出提示
	sm.Show();			// 输出基本信息
	sm.ShowSalary();		// 输出实发工资
	return 0;               	// 返回值, 返回操作系统
}