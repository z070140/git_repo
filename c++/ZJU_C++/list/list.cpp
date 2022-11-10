#include <iostream>
using namespace std;

int main() {
	//int a[10];
	//int* p = a;

	//*a = 10;
	//cout << a[0] << endl;
	//p[1] = 100;
	//cout << p[1] << endl;
	//*(p+1) = 111;
	//cout << p[1] << endl;
	//cout << a[0] << endl;
	//cout << p[0] << endl;

	char ac[] = { 0,1,2,3,4,5,6,7,8,9 };
	char* p = ac;
	
	//string a = NULL;
	int ai[] = { 0,1,2,3,4,5,6,7,8,9 };
	int* q = ai;
	printf("q  =%p\n", q);
	printf("q+1=%p\n", q + 1);
	
	cout << *(ac + 1)+48 << endl;
	cout << *(p + 1) + 48 << endl;

}