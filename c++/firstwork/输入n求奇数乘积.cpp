#include <iostream>
using namespace std;
int main(){
	int n;
	__int64 s=1;
	scanf("%d",&n);
	//printf("ÄúÊäÈëµÄÊÇ%d",n);
	int count[n];
	for(int i=0;i<n;i++){
		scanf("%d",&count[i]);
	}
//	for(int i=0;i<n;i++){
//		printf("%d''",count[i]);
//	}
	for(int i=0;i<n;i++){
		if(count[i]%2==1){
		//	printf("%d\n",count[i]);
			s*=count[i];
		//	printf("%d\n",s);
		}
	}
	printf("%d\n",s);
	return 0;
}