#include<iostream>
using namespace std;

class Str {
public:
	Str(const char *s = "") {
		_size = strlen(s);
		_str = new char[_size + 1];
		strcpy(_str, s);
	}
	Str(const Str& s) {
		_str = new char[strlen(s._str) + 1];
		strcpy(_str, s._str);
		_size = s._size;
	}

	size_t length() {
		return _size;
	 }

	void Swap(Str& s) {
		char* tmp = s._str;
		s._str = _str;
		_str = tmp;
	}
	Str& operator=(Str& s) {
		Str tmp(s._str);
		Swap(tmp);
		_size = tmp._size;
		return *this;
	}

	char* string() {
		return _str;
	}
private:
	char* _str;
	size_t _size;
};

int main() {
	Str s1;
	cout << s1.length() << endl;
	Str s2 = "abc";
	Str s3 = s2;
	cout << s3.length() << endl;
	cout << s3.string() << endl;
}