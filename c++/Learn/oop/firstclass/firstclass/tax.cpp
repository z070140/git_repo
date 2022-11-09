#include <iostream>
using namespace std;


class incomec {
private:
	double income, wage, taxrate;
public:
	incomec() {};
	void setWage(double m) {
		income = m;
	}
	double getTaxrat();

	double callncome() {


		return income-(income-2000)*getTaxrat();
	}

};

double incomec::getTaxrat() {
	if (income <= 2000) {
		wage = 0;
	}
	else if (income-2000 <= 2000) {
		wage = 0.05;
	}
	else if (income - 2000 > 2000 && income - 2000 <= 5000) {
		wage = 0.1;
	}
	else if (income - 2000 > 5000 && income - 2000 <= 10000) {
		wage = 0.15;
	}
	else if (income - 2000 > 10000) {
		wage = 0.2;
	}
	return wage;
}

int main() {
	double Wage;
	while (cin >> Wage) {
		incomec income;
		income.setWage(Wage);
		cout << income.callncome()<<endl;
	}
	return 0;
}