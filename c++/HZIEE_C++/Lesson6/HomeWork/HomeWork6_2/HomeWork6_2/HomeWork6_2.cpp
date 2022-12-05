#include <iostream>
#include<string>
using namespace std;

class Str {
public:
    Str(const char* str = "") {
        _size = strlen(str);
        _str = new char[_size + 1];
        strcpy(_str, str);
        _capacity = _size + 1;
    };

    Str(const Str& s) : _str(new char[strlen(s._str) + 1]) {
        strcpy(_str, s._str);
        _size = s._size;
        _capacity = s._capacity;
    };
	
    void Swap(Str& s) {
        char* tmp = s._str;
        s._str = _str;
        _str = tmp;
    }


    Str& operator=(Str& s) {
        Str tmp(s._str);
        Swap(tmp);
        _size = tmp._size;
        _capacity = tmp._capacity;
        return *this;
    }
    

    size_t length() { return _size; }
    char* string() { return _str; }

private:
	char* _str;
    size_t _size;
    size_t _capacity;
};
int main() {
    Str s1;
    Str s2 = "abc";
    Str s3 = s2;
    cout << s3.length() << endl;
    cout << s3.string() << endl;
}