#include <iostream>
using namespace std;
#include<string>
class Employee {
private:
	int num, wage,LenOfName,LenOfSex;
	static int count, totalWage;
	char name[18], sex[3];
	
public:
	Employee() {};
	Employee(int num,string Ename,string Esex,int wage) {
		this->num = num;
		strcpy(name, Ename.c_str());
		strcpy(sex, Esex.c_str());
		this->wage = wage;
		totalWage += wage;
		count += 1;
	}
	void ShowBase() {
		cout << "���˻�����Ϣ: \n���: " << num << "\n����: ";
		cout << name;
		cout << "\n�Ա�: ";
		cout << sex;
			cout<< "\n����: " << wage << "\n\n";
	}
	static void ShowStatic() {
		printf("����: %d\n�ܹ���: %dԪ\n",count,totalWage);
	}
};

int Employee::count = 0;
int Employee::totalWage = 0;

int main() {
	int numbers;
	cin >> numbers;
	Employee *employee= new Employee[numbers];
	int num, wage;
	string name, sex;
	for (int i = 0; i < numbers; i++) {
		cin >> num >> name >> sex >> wage;
		Employee emp(num,name,sex,wage);
		employee[i] = emp;
	}
	Employee::ShowStatic();
	for (int i = 0; i < numbers; i++) {
		employee[i].ShowBase();
	}

	return 0;
}