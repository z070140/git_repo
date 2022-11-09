#include<iostream>
using namespace std;
#include<map>
#include<unordered_map>
#include<string>

class Coin {
private:
	unordered_map<int, string> coinnames;
public:
	Coin() {
		//coinnames.insert(pair<int, string>(1,"penny"));
		//coinnames.insert(pair<int, string>(10, "dime"));
		//coinnames.insert(pair<int, string>(25, "quarter"));
		//coinnames.insert(pair<int, string>(50, "half-dolar"));
		//coinnames.insert(pair<int, string>(50, "��ë"));
		//coinnames.insert(pair<int, string>(50, "Ϊʲôֻ�е�һ�α���������"));
		coinnames.emplace(1,"penny");
		coinnames.emplace(10, "dime");
		coinnames.emplace(25, "quarter");
		coinnames.emplace(50, "half-dolar");
		coinnames.emplace(50, "��ë");
		coinnames.emplace(50, "Ϊʲôֻ�е�һ�α���������");
		cout << coinnames.size() << endl;
		for (auto i = coinnames.begin(); i !=coinnames.end(); i++) {
				cout << i->second << endl;
			}
		}
	
	string getName(int amount) {
		if (coinnames.count(amount)) {
		return coinnames.at(amount);
		}
		else {
			return "NOT FOUND";
		}
	}
};

int main() {
	int amount;

	cin >> amount;
	Coin* coin = new Coin();
	string name = coin->getName(amount);
	cout << name << endl;
}