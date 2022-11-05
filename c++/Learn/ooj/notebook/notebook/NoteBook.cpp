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
		memcpy(p, &notes[0], notes.size()*sizeof(notes[0]));
		return p;
	}

};

int main() {
	string *a[10];
	cout << a[0] << endl;
	cout << a[0].length() << endl;
	string s = "";
	cout << s.length() << endl;
	for (char i =49; i <sizeof(a)/sizeof(a[0]); i++) {
		a[i]=i;
	}
	cout << a[0] << endl;
	cout << a[0].length() << endl;
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