#include <iostream>
using namespace std;
#include <string>

class CharList {
private:
	char sex[3];
	int len;
public:
	CharList(string name1) {
		len = name1.length();
		for (int i = 0; i < len; i++) {
			sex[i] = name1[i];
			
		}
	}
	void  ShowList() {
		for (int i = 0; i < len; i++) {
			cout << sex[i];
		}
	 }
};



int main() {
	string name = "ÄÐ";
	CharList charlist(name);
	charlist.ShowList();
	return 0;

}