// People.cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//

#include <iostream>
using namespace std;


class People {
public:
    People(string nn,int a,int h,int w);
    void Eating(int eatTimes);
    void Sporting(int sportTimes);
    void Show();
private:
string Name;
int Age, Height, Weight;


};

People::People(string nn, int a, int h, int w) {
    Name = nn;
    Age = a;
    Height = h;
    Weight = w;
}
void People::Eating(int eatTimes) {
    Weight += eatTimes;
}
void People::Sporting(int sportTimes) {
    Height += sportTimes;
}
void People::Show() {
    cout << "姓名 " << Name << "\n年龄 " << Age << "\n身高 " << Height << "\n体重 " << Weight << endl;
}




int main()
{
    string nn;
    
    int a, h, w,eatTimes,sportTimes;
    cin >> nn >> a >> h >> w;
    cin >> eatTimes >> sportTimes;
    People people(nn, a, h, w);
    people.Eating(eatTimes);
    people.Sporting(sportTimes);
    people.Show();
     
    return 0;
}

// 运行程序: Ctrl + F5 或调试 >“开始执行(不调试)”菜单
// 调试程序: F5 或调试 >“开始调试”菜单

// 入门使用技巧: 
//   1. 使用解决方案资源管理器窗口添加/管理文件
//   2. 使用团队资源管理器窗口连接到源代码管理
//   3. 使用输出窗口查看生成输出和其他消息
//   4. 使用错误列表窗口查看错误
//   5. 转到“项目”>“添加新项”以创建新的代码文件，或转到“项目”>“添加现有项”以将现有代码文件添加到项目
//   6. 将来，若要再次打开此项目，请转到“文件”>“打开”>“项目”并选择 .sln 文件
