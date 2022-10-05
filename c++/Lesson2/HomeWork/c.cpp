#include <iostream>

using namespace std;

int main()
{   
    while(true){
        double x;
        double y;
        cin>>x>>y;
        double num1=1;
        double num2=1;
        double num3=1;
        double c =0;
        
        for (int i=1;i<=x;i++){
            num1 = num1*i;
        }
        for (int i=1;i<=y;i++){
            num2 = num2*i;
        }
        for(int i=1;i<=x-y;i++){
            num3 = num3 * i;
        }
        c = num1/(num2*num3);
        printf("%.0f \n",c);
    }
    
    
    return 0;
}