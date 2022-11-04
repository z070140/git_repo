#include<iostream>
#include<string>
#include <string.h>
using namespace std;

class Test {
private:
	char s[100];
public:
	Test(string name) {
		strcpy(s, name.c_str());
	}
	char* getS() {
		return s;
	}	
};

int main() {
	Test test("Hello World!");
	cout << test.getS();
	/*char s[4];
	string str = "abc";
	strcpy(s, str.c_str());
	cout<<s;*/
}