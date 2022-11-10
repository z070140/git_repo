#include <iostream>
using namespace std;
int main(){
	for (int i=0;i<5;i++){
		static int k=0;
		k++;
		cout<<k<<endl;
	}
}