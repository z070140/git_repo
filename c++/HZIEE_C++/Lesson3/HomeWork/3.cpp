#include <iostream>
using namespace std;

int CountChar(char *p, char ch)
{
    int n = 0;
    int i = 0;
    while (p[i] != '\0')
    {
        if (p[i] == ch)
        {
            n++;
        }
        i++;
    }
    return n;
}

int main()
{
    char s[128];
    gets(s);
    int n;

    char a = getchar();
    n = CountChar(s, a);
    cout << n << endl;
    return 0;
}
