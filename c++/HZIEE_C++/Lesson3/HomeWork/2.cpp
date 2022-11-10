#include <iostream>
using namespace std;
int f(char s[])
{

    int count = 0;
    for (int i = 0; s[i] != '\0';i++)
    {
        if (s[i] >= 'a' && s[i] <= 'z')
        {
            s[i] -= 32;
            count++;
        }
    }

    return count;
}

int main()
{
    char s[128];
    cin >> s;

    int num = f(s);
    cout << s << endl;
    cout << num << endl;

    return 0;
}