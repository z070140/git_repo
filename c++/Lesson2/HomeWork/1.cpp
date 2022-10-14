#include <iostream>

using namespace std;

int main()
{
    cout<<"Hello World";
    char c[65];
    __int64 value;
    while(cin>>c){
        if(c[0]=='-'){
            break;
        }
        value =0;
        for (int i=0;c[i]!='\0';i++){
            value = value*2+c[i]-'0';
        }
        cout<<value<<endl;
        
    }
    return 0;
}
