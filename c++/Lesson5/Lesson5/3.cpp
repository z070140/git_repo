#include<iostream>
using namespace std;
#include<string>

class Pos;
class Person {
public: 
	Person() ;
	void getPosition();

private:
	
	Pos* pos;
};



class Pos {
	friend class Person;
public:
	Pos();
	string name;

};

Pos::Pos() {
	this->name = "Ãû×Ö";
}

void Person::getPosition() {
	cout << pos->name << endl;
}


Person::Person()
{
	pos = new Pos;
}
void test01() {
	Person person;
	person.getPosition();
}


int main() {

	test01();

	system("pause");

	return 0;
}