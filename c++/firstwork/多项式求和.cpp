#include <iostream>
#include <cmath>
using namespace std;
int main(){
	while (true){
		int n;
		scanf("%d",&n);
		double count[n];
		double s=0,m;
		for(int i=1;i<n+1;i++){
			m = pow(-1,i-1);
			//printf("%f\n",m);
			s = s + m/i;
		}
		printf("%.2f\n",s);
	}
}