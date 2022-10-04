#include <iostream>
#include <string>
#include <cmath>
using namespace std;
int main(){
	
	
	while(true){
	int num =0;
	//string num = "";
	cin >> num;
	if (num==-1){
	    break;
	}
	int sum = 0;
	int count = 0;
	while (num!=0){
	    sum  = sum + pow(2,count)*(num%10);
	    num /=10;
	    count++;
	}
	cout <<  sum<<"\n";
	
	}
	return 0;
}