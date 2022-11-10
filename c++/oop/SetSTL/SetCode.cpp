#include<iostream>
using namespace std;
#include<set>
#include<vector>


int main() {
	set<string>s ;
	s.insert("first");
	s.insert("second");
	s.insert("first");

	for (string newString : s) {
		cout << newString << endl;
	}

	cout << &s << endl;
	vector<string>v;
	v.push_back("1");
	v.push_back("2"); v.push_back("3"); v.push_back("4");
	cout << v[1] << endl;


	cout << s.max_size() << endl;
	cout << v.max_size() << endl;

	cout << "-----------" << endl;
	return 0;
}