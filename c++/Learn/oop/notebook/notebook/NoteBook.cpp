#include <iostream>
using namespace std;
#include<string>
#include <vector>
#include<exception>

class NoteBook {
private:
	vector<string> notes;
	string* p;
public:
	void add(string s){
		notes.push_back(s);
		//cout << sizeof(notes) << endl;
	}
	void add(string s, int location) {
		notes.insert(notes.begin() + location, s);
		//cout << sizeof(notes)<<endl;
	}
	int getSize() {
		return notes.size();
	}
	string getNote(int index) {
		return notes[index];
	}
	void removeNote(int index) {
		notes.erase(notes.begin()+index);
		
	}
	//string* list() {
	//	string *p= new string[(int)notes.size()];
	//	for (int i = 0; i < notes.size(); i++) {
	//		p[i] = notes[i];
	//	}
	//	return p;
	//}

	string* list() {
		
		string* p = new string[(int)notes.size()];
		//int a = sizeof(notes);
		memcpy(p, &notes[0], notes.size()*sizeof(notes[0]));
		return p;
	}

};

class Value {
private:
	int value;
public:
	Value() {

	}
	void set(int value) {
		this->value = value;
	}
	int get() {
		return value;
	}
	Value( const Value& value) {
		cout << "复制构造中..." << endl;
	}
};

int main() {
//Value a[10];
	Value* a = new Value[10];
	cout << &a[10] -a<< endl;
	for (int i = 0; i < 10; i++) {
		cout << a[i].get() << endl;
	}
	for (int i = 0; i < 10; i++) {
		a[i].set(i);
	}
	
	for (int i = 0; i < 10; i++) {
		cout << a[i].get() << endl;
	}
	for (Value v :a) {
		cout << v.get()<<endl;
		v.set(0);
	}
	for (int i = 0; i < 10; i++) {
		cout << a[i].get() << endl;
	}

	string aString[3] = {"1","2","3"};
	for (string outString : aString) {
		cout << outString << endl;
	}
	delete a;
	vector<string> vec;
	vec.push_back("10");
	vec.push_back("20");

	for (string i : vec)
	{
		cout << i << endl;
	}
	
	//string s = "";
	//cout << s.length() << endl;
	//for (char i =49; i <sizeof(a)/sizeof(a[0]); i++) {
	//	a[i]=i;
	//}
	//cout << a[0] << endl;
	//cout << a[0].length() << endl;
	////string a[2];
	////a[0] = "first";
	////a[1] = "second";
	//NoteBook nb;
	//nb.add("first");
	//nb.add("second");
	//nb.add("third", 1);
	//
	////cout << nb.getNote(1)<<endl;
	//nb.removeNote(1);
	//string* p = nb.list();
	//for (int i = 0;i< nb.getSize(); i++) {
	//	cout << p[i] << endl;
	//}
	////string a = "";
	////cout << sizeof(a)<<endl;
	////string b = "我是有数据的啊";
	////cout << sizeof(b)<<endl;

	//string a[10];
	//cout << a[0] << endl;
	return 0;
}