#include <iostream>
using namespace std;
#include<string>
#include <vector>

class NoteBook {
private:
	vector<string> notes;
	string* p;
public:
	void add(string s){
		notes.push_back(s);
	}
	void add(string s, int location) {
		notes.insert(notes.begin() + location, s);
	}
	int getSize() {
		return notes.size();
	}
	string getNote(int index) {
		return notes[index];
	}
	void removeNote(int index) {
		try{
		notes.erase(notes.begin()+index);
		}
		catch(exception e) {
			cout << "Òì³££¡Ô½½ç£¡" << endl;
		}

	}
	string* list() {
		string* p= new string[(int)notes.size()];
		for (int i = 0; i < notes.size(); i++) {
			p[i] = notes[i];
		}
		return p;
	}
};

int main() {
	//string a[2];
	//a[0] = "first";
	//a[1] = "second";
	NoteBook nb;
	nb.add("first");
	nb.add("second");
	nb.add("third", 1);
	//cout << nb.getNote(1)<<endl;
	nb.removeNote(1);
	string* p = nb.list();
	for (int i = 0;i< nb.getSize(); i++) {
		cout << p[i] << endl;
	}
	return 0;
}