#include <iostream>
using namespace std;
int main(){
	int n, k ;
	cout<<"请输入一个整数";
	cin >> n;
	cout <<"整数"<< n <<"的因子有";
	for (k=1;k<=n;k++)
		if (n%k==0)
			cout << k << "\n";
	cout<<endl;
	return 0;
}