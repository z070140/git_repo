#include <iostream>
#include <cmath>
using namespace std;
int main(){
	double a,b,c,s,area;
	cin>>a>>b>>c;
	if (a+b>c&&a+c>b&&b+c>a){
		s=(a+b+c)/2;
		area=sqrt(s*(s-a)*(s-b)*(s-c));
		printf("area=%.3f",area);
	}
	else
		printf("�߶�%.2f,%.2f,%.2f���ܹ���������\n",a,b,c);
	return 0;
}