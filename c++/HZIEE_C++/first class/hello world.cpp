#include <iostream>
using namespace std;
int main()
{
	cout<<"Hello,World!"<<endl;
	
	int x,y;
	cout<<"Enter x and y:";
	cin>>x>>y;
	cout<<x<<endl;
	cout<<y<<endl;	
	if (x != y)
		if (x > y)
			cout<<"x<y"<<endl;
		else 
			cout<<"x>y"<<endl;
	else
		cout<<"x=y"<<endl;
	return 0;
	
}