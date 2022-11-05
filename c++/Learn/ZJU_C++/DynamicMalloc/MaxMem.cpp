#include <iostream>
using namespace std;
#include <stdlib.h>

int main() {
	void* p=0;
	int cnt = 0;
	p = malloc(100 * 1024 * 1024);
	//p++;
	free(p);
	free(p);
	cout << "我还能运行么" << endl;
	return 0;
}