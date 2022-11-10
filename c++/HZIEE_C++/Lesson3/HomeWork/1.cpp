#include <iostream>
using namespace std;
bool wanshu(int n);
int main(){
	int n = 0;
	cin>>n;
	
	
	if(wanshu(n)){
		cout<<"yes";
	}else{
		cout<<"no";
	}
	
	return 0;
}
bool wanshu(int n){
	int count =0;
	bool isWanshu =true;
	for (int i=1;i<n;i++){
		if (n%i==0){
			count +=i;
		}
	}
		if (count == n){
			
		}
		else{
			isWanshu=false;
		}
	

	
	return isWanshu;
}