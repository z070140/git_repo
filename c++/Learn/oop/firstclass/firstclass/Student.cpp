#include <iostream>
#include <string>
using namespace std;

class Student {
public:


	Student(string name, int score) {
		
		this->score = score;
	}
	friend string compare(Student& s1, Student& s2) {
		if (s1.score > s2.score) {
			return ">";
		}
		else if (s1.score < s2.score) {
			return "<";
		}
		return "=";
	}
	static int getAvg() {
		avg = total / count;
		return avg;
	}
	static int getTotal() {
		return total;
	}
private:
	string name;
	int score;
	static int total;
	static int count;
	static int avg;




};
int Student::total = 0;
int Student::count = 0;
int Student::avg = 0;

int main() {
	
	string name1, name2;
	int score1, score2;
	cin >> name1 >> score1 >> name2 >> score2;
	//while (cin>>name>>score)
	//{
	//	Student student(name,score);
	//}
	//cout << Student::getTotal() << "\n" <<Student::getAvg();
	Student student1(name1, score1);
	Student student2(name2, score2);
	cout << compare(student1,student2);

	return 0;
}