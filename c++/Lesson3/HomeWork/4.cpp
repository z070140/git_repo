#include <iostream>
using namespace std;

int f(int n);

int main(){
	int n ;
	cin>>n;
	
	cout<< f(n);
	

    return 0;
}

int f(int n){
	int num =0;
	for (int i = 1;i<=n;i++){
		if (i%3==2&&i%5==3&&i%7==5){
			num = i;
		}
	}
	
	
	return num;
}