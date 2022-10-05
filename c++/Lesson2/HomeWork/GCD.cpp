#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int num[100][2];
    int GCD[100];
    int i=0;
    for(i;i<=99;i++){
        cin>>num[i][0]>>num[i][1];
        if (num[i][0]==-1||num[i][1]==-1){          //最后一行任意元素输入-1代表输入结束
            break;
        }
    }
    int j =0;
    int number;
    for (j;j<=i;j++){
        if (num[j][0]==-1||num[j][1]==-1){
            break;
        }
        while(num[j][1]>0){
            number = num[j][0] % num[j][1];
            num[j][0] = num[j][1];
            num[j][1] = number;
        }
        GCD[j]=num[j][0];
    }
    int k=0;
    sort(GCD,GCD+j);
    for (k;k<j;k++){
        cout << GCD[k] << " ";
    }
    
    return 0;
}