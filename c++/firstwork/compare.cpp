#include <iostream>
using namespace std;
int main(){
	char a,b,c,max;
	cin>>a>>b>>c;
	if (a>b){
		max =a;
		a =b;
		b=max;
		}
	if(b>c){
		max =b;
		b = c ;
		c = max;
	}
	if (a>b){
		max = a;
		a= b;
		b =max;
	}
		
	cout<<a<<b<<c<<endl;
}
