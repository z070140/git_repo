#include <iostream>
using namespace std;
int main(){
	int n, k ;
	cout<<"������һ������";
	cin >> n;
	cout <<"����"<< n <<"��������";
	for (k=1;k<=n;k++)
		if (n%k==0)
			cout << k << "\n";
	cout<<endl;
	return 0;
}